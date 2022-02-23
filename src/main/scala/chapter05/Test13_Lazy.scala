package chapter05

object Test13_Lazy {
    def main(args: Array[String]): Unit = {
        lazy val result = sum(13, 17)

        println("1.函数调用")
        println("2.result = " + result)

        def sum(i: Int, j: Int) = {
            println("3.sum调用")
            i + j
        }
    }

}
