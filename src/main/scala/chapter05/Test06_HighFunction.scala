package chapter05

/**
 * 函数至简原则
 */
object Test06_HighFunction {
    def main(args: Array[String]): Unit = {
        def f(n: Int): Int = {
            println("f调用")
            n + 1
        }

        val result = f(123)
        println(result)

        // 1.函数可以作为值进行传递
        val f1: Int => Int = f _
        val f2: Int => Int = f
        val f3 = f(_)
        println(f1)
        println(f1(12))

        println("=============================================")

        def fun(): Int = {
            println("fun调用")
            1
        }

        fun
        fun()

        val f4 = fun _
        println(f4)

        // 2.函数可以作为参数进行传递
        def dualEval(op: (Int, Int) => Int, i: Int, j: Int) = op(i, j)

        def add(i: Int, j: Int) = i + j

        println(dualEval(add, 11, 22))
        println(dualEval((a, b) => a + b, 11, 22))
        println(dualEval(_ + _, 11, 22))

        // 3.函数可以作为函数的返回值返回
        def f5() = {
            def f6(a: Int): Unit = println("f6调用:" + a)
            f6 _
        }

        println(f5()(1))

    }
}
