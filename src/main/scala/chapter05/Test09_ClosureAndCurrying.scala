package chapter05

object Test09_ClosureAndCurrying {
    def main(args: Array[String]): Unit = {
        def add(a: Int, b: Int): Int = a + b

        // 1.考虑固定一个加数的场景
        def addByFour(b: Int): Int = 4 + b

        // 2.扩展固定加数改变的情况
        def addByFive(b: Int): Int = 5 + b

        // 2.将固定加数作为另一个参数传入,但是是作为"第一层参数"传入
        def addByFour1(): Int => Int = {
            val a = 4

            def addB(b: Int): Int = a + b

            addB
        }

        def addByA(a: Int): Int => Int = {

            def addB(b: Int): Int = a + b

            addB
        }

        println(addByA(35)(24))

        def addByA1(a: Int): Int => Int = a + _

        println(addByA1(35)(24))

        // 柯里化
        def addCurrying(a: Int)(b: Int): Int = a + b

        println(addCurrying(1)(2))
    }

}
