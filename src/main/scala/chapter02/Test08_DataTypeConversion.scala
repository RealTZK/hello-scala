package chapter02

object Test08_DataTypeConversion {
    def main(args: Array[String]): Unit = {

        // 1.自定类型转换

        val a1: Byte = 10
        val b1: Long = 2542
        val result1: Long = a1 + b1
        val result11: Int = (a1 + b1).toInt

        val a2: Byte = 10
        val b2: Int = a2
        // val c2: Byte = b2

        val a3: Byte = 10
        val b3: Char = 'b'
        // val c3: Byte = b3 //error
        val c3: Int = b3
        println(c3)

        val a4: Byte = 12
        val b4: Short = 23
        val c4: Char = 'c'
        val result4: Int = a4 + b4
        val result44 = a4 + b4 + c4
        println(result44)

        // 2.强制类型转换
        val n1: Int = 2.5.toInt
        println(n1) // 2

        val n2: Int = (2.6 + 3.7).toInt
        println(n2) // 6

        // 3.数值类型和String类型
        val n = 27
        val s: String = n + ""
        println(s)

        val m = "12".toInt
        val f = "1.1".toFloat
        // val f2 = "1.1".toInt // For input string: "1.1"
    }
}
