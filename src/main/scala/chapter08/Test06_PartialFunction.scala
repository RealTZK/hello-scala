package chapter08

object Test06_PartialFunction {
    def main(args: Array[String]): Unit = {
        val list = List("a" -> 18, "b" -> 35, "c" -> 27, "a" -> 13)

        // 1.实现value*2
        val newList = list.map(value => value._1 -> value._2 * 2)

        // 2.用模式匹配对元组元素赋值实现功能
        val newList2 = list.map(
            value =>
                value match {
                    case (word, count) => word -> count * 2
                }
        )

        // 3.省略lambda表达式
        val newList3 = list.map {
            case (word, count) => word -> count * 2
        }

        // 4.偏函数应用,求绝对值
        // 对输入数据分为不同的情形:正、负、零
        val positiveAbs: PartialFunction[Int, Int] = {
            case x if x > 0 => x
        }

        val negativeAbs: PartialFunction[Int, Int] = {
            case x if x < 0 => -x
        }

        val zeroAbs: PartialFunction[Int, Int] = {
            case 0 => 0
        }

        def abs(x: Int) = (positiveAbs orElse negativeAbs orElse zeroAbs) (x)

        println(abs(11))
        println(abs(-11))
        println(abs(0))

    }
}
