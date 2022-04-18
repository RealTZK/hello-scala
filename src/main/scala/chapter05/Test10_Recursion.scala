package chapter05

object Test10_Recursion {
    def main(args: Array[String]): Unit = {
        def factorial(i: Long): Long =
            if (i == 0)
                1
            else {
                val tmp = factorial(i - 1)
                i * tmp
            }

        println(factorial(4))
        println(factorial(25))

        // 尾递归
        def tailFactorial(i: Long): Long = {
            def loop(i: Long, temp: Long = 1): Long =
                if (i == 0)
                    temp
                else {
                    val tmp = loop(i - 1, temp * i)
                    tmp
                }

            loop(i)
        }
    }

}
