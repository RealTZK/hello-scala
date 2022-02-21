package chapter04

import scala.collection.immutable
import scala.language.postfixOps

object Test02_ForLoop {
    def main(args: Array[String]): Unit = {
        // 1.范围遍历
        for (i <- 1 to 10) {
            println(i + ".hello")
        }
        for (i <- 1.to(10)) {
            println(i + ".hello")
        }
        for (i <- Range(1, 10)) {
            println(i + ".hello")
        }
        for (i <- 1 until 10) {
            println(i + ".hello")
        }

        println("=========================================")

        // 2.集合遍历
        for (i <- Array(1, 2, 3, 4, 5, 4, 3, 2, 1)) {
            println(i)
        }

        println("=========================================")

        // 3.循环守卫
        for (i <- 1 to 10 if i != 5) {
            println(i + ".hello")
        }

        println("=========================================")

        // 4.循环步长
        for (i <- (1 to 10 by 2)) {
            println(i + ".hello")
        }

        13 to 30 by 3 foreach println
        30 to 13 by -2 foreach println

        for (i <- 1 to 10 reverse) {
            println(i)
        }

        for (d <- 1.0 to 10 by 0.53) {
            println(d)
        }

        println("=========================================")

        // 5.循环嵌套
        for (i <- 1 to 3) {
            for (j <- 1 to 3) {
                println("i=" + i + ",j=" + j)
            }
        }
        println("------------------------------------------")
        for (i <- 1 to 3; j <- 1 to 3) {
            println("i=" + i + ",j=" + j)
        }

        println("=========================================")

        // 6.循环引入变量
        for (i <- 1 to 10; j = 10 - i) {
            println("i=" + i + ",j=" + j)
        }

        println("=========================================")

        // 6.循环返回值
        val ints: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i
        println(ints)
    }
}
