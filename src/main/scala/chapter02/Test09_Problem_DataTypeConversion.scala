package chapter02

/**
 * 128:Int
 * 原码 0000 0000 0000 0000 0000 0000 1000 0000
 * 补码 0000 0000 0000 0000 0000 0000 1000 0000
 *
 * 截取最后一个字节,Byte
 * 补码 1000 0000
 * 表示最大的复数 -128
 *
 * 130:Int
 * 原码 0000 0000 0000 0000 0000 0000 1000 0010
 * 补码 0000 0000 0000 0000 0000 0000 1000 0010
 *
 * 截取最后一个字节,Byte
 * 补码 1000 0010
 * 原码 1111 1110
 * -126
 */
object Test09_Problem_DataTypeConversion {
    def main(args: Array[String]): Unit = {
        val i: Int = 128
        val b: Byte = i.toByte
        println(b)

        val i1: Int = 130
        val b1: Byte = i1.toByte
        println(b1)
    }
}
