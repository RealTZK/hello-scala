package chapter08

object Test02_MatchTypes {
    def main(args: Array[String]): Unit = {
        // 1.匹配常量
        def describeConst(x: Any) = {
            x match {
                case 1 => "Int one"
                case "hello" => "String hello"
                case true => "Boolean true"
                case '+' => "Char +"
                case _ => "Unknown"
            }
        }

        println(describeConst(1))
        println(describeConst(true))
        println(describeConst(5))

        // 2.匹配类型
        def describeType(x: Any) = x match {
            case i: Int => "Int " + i
            case i: String => "String " + i
            case i: Boolean => "Boolean " + i
            case i: List[Any] => "List[Any] " + i.mkString(",")
            case i: List[String] => "List[String] " + i.mkString(",") // 无效,泛型擦除
            case i: Array[String] => "Array[String] " + i.mkString(",")
            case i: Array[Int] => "Array[Int] " + i.mkString(",")
            case _ => "Unknown type " + x.toString
        }

        println(describeType(List(1, 2, 3, 4)))
        println(describeType(List("1", "2", "3", "4")))
        println(describeType(Array(1, 2, 3, 4)))
        println(describeType(Array("1", "2", "3", "4")))
        println(describeType(Array(x = true)))

        // 3.匹配数组
        for (elem <- List(
            Array(0),
            Array(1, 0),
            Array(0, 1, 0),
            Array(1, 1, 0),
            Array(2, 3, 7, 15),
            Array("hello", 20, 30)
        )) {
            val result = elem match {
                case Array(0) => "0"
                case Array(1, 0) => "Array(1, 0)"
                case Array(x, y) => s"Array($x, $y)"
                case Array(0, _*) => s"以0开头的数组Array(0, x*)"
                case Array(_, 1, _) => s"中间为1的三元素数组"
                case _ => "something"
            }

            println(result)
        }

        println("========================")

        // 4.匹配列表
        for (elem <- List(
            List(0),
            List(1, 0),
            List(0, 1, 0),
            List(1, 1, 0),
            List(2, 3, 7, 15),
            List("hello", 20, 30)
        )) {
            val result = elem match {
                case List(0) => "0"
                case List(1, 0) => "List(1, 0)"
                case List(x, y) => s"List($x, $y)"
                case List(0, _*) => s"以0开头的List(0, x*)"
                case List(_, 1, _) => s"中间为1的三元素List"
                case _ => "something"
            }

            println(result)
        }

        val list = List(1, 2, 3, 4, 5)
        val list2 = List(1)

        list match {
            case first :: second :: rest => println(s"first:$first second:$second rest:$rest")
            case _ => println("something else")
        }
        list2 match {
            case first :: second :: rest => println(s"first:$first second:$second rest:$rest")
            case _ => println("something else")
        }

        println("========================")

        // 5.匹配元组
        for (elem <- List(
            (0, 1),
            (0, 0),
            (0, 1, 0),
            (0, 1, 1),
            (1, 23, 56),
            ("hello", true, 0.5)
        )) {
            println(elem match {
                case (_, _) => "(_, _)"
                case (0, _) => "(0, _)"
                case (_, 1, _) => "(_, 1, _)"
                case _ => "_"
            })
        }

    }
}
