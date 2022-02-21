package chapter02

import chapter01.Student

import java.io.{File, PrintWriter}
import scala.io.Source

object Test07_DataType {
    def main(args: Array[String]): Unit = {
        // (1) 整形
        val a1: Byte = 127
        val a2: Byte = -128

        // val a3: Byte = 128

        val a4 = 12 // 整数默认类型为Int
        val a5 = 134123412345123512L // 长整型

        val b1: Byte = 10
        val b2: Byte = (10 + 20)
        println(b2)

        // val b3: Byte = (b1 + 20)
        val b3: Byte = (b1 + 20).toByte
        println(b3)

        // (2) 浮点类型
        val f1 = 1.2345f
        val d1 = 1.2345

        // (3) 字符类型
        val c1 = 'a'
        val c2 = '9'
        val c3 = '\t' // 制表符
        val c4 = '\n' // 换行符

        // 转义字符
        val c5 = '\\' // '\'自身
        val c6 = '\"'

        // 字符变量底层保存ASCII码
        val i1: Int = c1
        println(i1)
        val i2: Int = c2
        println(i2)
        val c7: Char = (i1 + 1).toChar
        println(c7)
        val c8: Char = (i2 + 1).toChar
        println(c8)

        // (4) 布尔类型
        val isTrue = true

        // (5) 空类型
        // Unit
        def m1(): Unit = {
            println("m1被调用执行")
        }

        val a = m1();
        println(a)

        // Null
        // val n: Int = null // an expression of type Null is ineligible for implicit conversion
        var student = new Student("tzk", 23)
        student = null
        println(student)

        // Nothing
        def m2(n: Int): Int = {
            if (n == 0)
                throw new NullPointerException
            else
                n
        }

        val b = m2(1)
        println(b)
    }
}
