package chapter04

import scala.util.control.Breaks._

object Test06_Break {
    def main(args: Array[String]): Unit = {
        // 1.抛出异常中断循环
        try {
            for (elem <- 0 until 5) {
                if (elem == 3) throw new RuntimeException
                println(elem)
            }
        } catch {
            case e: Exception =>
        }

        // 2.使用Scala中的Breaks类中的break方法,实现异常的抛出和补货
        breakable(
            for (elem <- 0 until 5) {
                if (elem == 3) break()
                println(elem)
            }
        )
    }
}