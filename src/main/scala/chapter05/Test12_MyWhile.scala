package chapter05

object Test12_MyWhile {
    def main(args: Array[String]): Unit = {
        var i = 10

        while (i >= 1) {
            println(i)
            i -= 1
        }

        println("===============================================")

        // 用闭包实现一个函数,将代码块作为参数传入,递归调用
        def `while`(flag: => Boolean): (=> Unit) => Unit = {
            // 内层函数需要递归调用,参数就是循环体
            def doLoop(op: => Unit): Unit = {
                if (flag) {
                    op
                    `while`(flag)(op)
                }
            }

            doLoop _
        }

        i = 10

        `while`(i >= 1) {
            println(i)
            i -= 1
        }

        println("===============================================")

        def `while1`(flag: => Boolean): (=> Unit) => Unit = {
            // 内层函数需要递归调用,参数就是循环体
            op =>
                if (flag) {
                    op
                    `while1`(flag)(op)
                }
        }

        i = 10

        `while1`(i >= 1) {
            println(i)
            i -= 1
        }

        println("===============================================")

        def `while2`(flag: => Boolean)(op: => Unit): Unit = {
            // 内层函数需要递归调用,参数就是循环体
            if (flag) {
                op
                `while2`(flag)(op)
            }
        }

        i = 10

        `while2`(i >= 1) {
            println(i)
            i -= 1
        }

    }

}
