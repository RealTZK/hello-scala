package chapter04

import scala.language.postfixOps

/**
 * 输出9层金字塔
 */
object Test04_Practice_Tower {
    def main(args: Array[String]): Unit = {
        for (i <- 1 to 9; j = 2 * i - 1; k = (17 - j) / 2) {
            println(" " * k + "*" * j + " " * k)
        }
    }
}
