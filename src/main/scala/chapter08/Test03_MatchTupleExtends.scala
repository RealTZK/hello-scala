package chapter08

object Test03_MatchTupleExtends {
    def main(args: Array[String]): Unit = {
        // 1.在变量声明时匹配
        val (x, y) = (10, "hello")
        println(s"x:$x y:$y")

        val List(first, second, _*) = List(25, 15, 9, 78)
        println(s"first:$first second:$second")

        val fir :: sec :: rest = List(25, 15, 9, 78)
        println(s"fir:$fir sec:$sec rest:$rest")

        // 2.for推导式中进行模式匹配
        val list = List(("a", 12), ("b", 25), "c" -> 27)

        // 2.1 原本的遍历方式
        for (elem <- list) println(elem._1 + " " + elem._2)

        // 2.2 将List的元素直接定义为元组,对变量赋值
        for ((word, count) <- list) println(word + " " + count)
        println("---------------------------------------")

        // 2.3 可以不考虑某个位置的变量,只遍历某个位置的元素
        for ((word, _) <- list) println(word)

        // 2.4 可以指定某个位置的值必须是多少
        for (("a", count) <- list) println("a " + count)
    }
}
