package chapter02

import scala.io.StdIn

object Test05_StdIn {
    def main(args: Array[String]): Unit = {
        // (1) 输入信息
        println("请输入您的名称:")
        val name = StdIn.readLine()
        println("请输入您的年龄:")
        val age = StdIn.readInt()

        // (2) 控制台打印输出
        println(s"欢迎${age}岁的${name}来到哔哩哔哩学习")
    }
}
