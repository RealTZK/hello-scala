package chapter03

object Test01_Operator {
    def main(args: Array[String]): Unit = {
        // 1.算数运算符
        val result1 = 10 / 3
        println(result1)

        val result2 = 10 / 3D
        println(result2.formatted("%5.2f"))

        val result3 = 10 % 3
        println(result3)

        // 2.比较运算符
        val s1 = "hello"
        val s2 = new String("hello")
        println(s1 == s2)
        println(s1.equals(s2))
        println(s1.eq(s2))

        println("==================================")

        // 3.逻辑运算符
        def m(n: Int): Int = {
            println("m被调用")
            return n
        }

        val n = 1
        println((4 > 5) && m(n) > 0)

        // 4.位运算符
        val a = 60 // 0011 1100
        println(a << 3)

        val b = -13 // 0000 1101; 1111 0011
        println(b << 2)
        println(b >> 2)
        println(b >>> 2)

        // 5.运算符的本质
        val n1 = 12
        val n2 = 27
        println(n1.+(n2))
        println(n1 + n2)

        println((7.5 toInt) toChar)
    }
}
