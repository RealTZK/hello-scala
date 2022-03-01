package chapter07

object Test15_HighLevelFunction_Reduce {
    def main(args: Array[String]): Unit = {
        val list = List(0, 1, 2, 3, 4)

        // reduce
        println("1:" + list.reduce((i, j) => if (i >= j) i else j))
        println("1:" + list.reduceLeft((i, j) => if (i >= j) i else j))
        println("1:" + list.reduceRight((i, j) => if (i >= j) i else j))

        println("-------------------------------------------------------------")

        val list2 = List(3, 4, 5, 8, 10)
        println("1:" + list2.reduce(_ - _))
        println("1:" + list2.reduceLeft(_ - _))
        println("1:" + list2.reduceRight(_ - _))

        // fold
        println("2:" + list.fold(10)(_ + _))
        println("2:" + list2.foldRight(12)(_ - _)) // 3 - (4 - (5 - (8 - (10 - 12))))
    }
}
