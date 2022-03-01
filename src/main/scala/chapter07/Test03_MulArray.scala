package chapter07

object Test03_MulArray {
    def main(args: Array[String]): Unit = {
        // 1.创建二维数组
        val array = Array.ofDim[Int](2, 3)

        // 2.访问二维数组
        array(0)(2) = 19
        array(1)(0) = 25

        // 3.遍历二维数组
        println(array.mkString("Array(", ", ", ")"))
        for (arr <- array) {
            for (elem <- arr) {
                print(elem + "\t")
            }
            println
        }

        array.foreach(_.foreach(println))
    }
}
