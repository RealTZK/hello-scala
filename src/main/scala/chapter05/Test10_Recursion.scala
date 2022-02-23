package chapter05

import scala.annotation.tailrec

object Test10_Recursion {
    def main(args: Array[String]): Unit = {
        println(factorial(0))
        println(factorial(5))
        // println(factorial(500000000)) // StackOverflowError
        println(tailFactorial(0))
        println(tailFactorial(5))
        println(tailFactorial(500000000))
    }

    def factorial(i: Int): Int = if (i == 0) 1 else i * factorial(i - 1)

    // 尾递归
    def tailFactorial(i: Int): Int = {
        @tailrec
        def loop(i: Int, temp: Int = 1): Int = if (i == 0) temp else loop(i - 1, temp * i)

        loop(i)
    }

}
