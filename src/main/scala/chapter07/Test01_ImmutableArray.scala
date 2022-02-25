package chapter07

object Test01_ImmutableArray {
    def main(args: Array[String]): Unit = {
        val arr = new Array[Int](5)
        val arr2 = Array(13, 19, 25, 134, 34)

        println(arr(0))
        println(arr(2))

        arr(0) = 12
        arr.update(2, 45)
        println(arr.apply(0))
        println(arr(2))
        println("==================================")

        // 普通for循环
        for (i <- 0 until arr.length) {
            println(arr(i))
        }

        println("-----------------------------------")

        for (i <- arr.indices) {
            println(arr(i))
        }

        println("==================================")

        // 增强for循环
        for (elem <- arr) println(elem)

        println("==================================")

        // 迭代器
        val iterator = arr.iterator
        while (iterator.hasNext) println(iterator.next)

        println("==================================")

        // foreach
        arr.foreach(println)

        // mkString
        println(arr.mkString(","))

        // 添加元素
        val arr3 = arr2.:+(66)
        println(arr2.mkString(","))
        println(arr3.mkString(","))

        val arr4 = arr3.+:(66)
        println(arr4.mkString(","))

        val arr5 = arr4 :+ 77
        println(arr5.mkString(","))

        val arr6 = 99 +: arr5
        println(arr6.mkString(","))
    }
}
