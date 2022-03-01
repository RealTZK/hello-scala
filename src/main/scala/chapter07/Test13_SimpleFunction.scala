package chapter07

object Test13_SimpleFunction {
    def main(args: Array[String]): Unit = {
        val list1 = List(7, 1, 22, 9, 11, 3, 5, 33)
        val list2 = List((7, 1), (22, 9), (11, 3), (5, 33))

        // 求和
        println("1:" + list1.sum)

        // 求积
        println("2:" + list1.product)

        // 最大值
        println("3:" + list1.max)
        println("3:" + list2.maxBy(tuple => tuple._2))
        println("3:" + list2.maxBy(_._2))

        // 最小值
        println("4:" + list1.min)
        println("4:" + list2.minBy(_._2))

        // 排序
        println("5:" + list1.sorted) // 从下=小到大
        println("5:" + list1.sorted(Ordering[Int].reverse)) // 从大到小
        println("5:" + list2.sortBy(_._2))
        println("5:" + list2.sortBy(_._2)(Ordering.Int.reverse))

        println("5:" + list1.sortWith(_ > _))

    }
}
