package chapter07

object Test12_DerivedCollection {
    def main(args: Array[String]): Unit = {
        val list1 = List(1, 3, 5, 7, 9, 11, 22, 33)
        val list2 = List(0, 2, 4, 6, 8, 11, 22, 33)

        // 集合的头
        println("1:" + list1.head)

        // 集合的尾(即集合去掉头)
        println("2:" + list1.tail)

        // 集合最后一个元素
        println("3:" + list1.last)

        // 集合初始元素(即集合去掉尾)
        println("4:" + list1.init)

        // 反转
        println("5:" + list1.reverse)

        // 取前(后)n
        println("6:" + list1.take(3))
        println("6:" + list1.takeRight(3))

        // 去掉前(后)n
        println("7:" + list1.drop(3))
        println("7:" + list1.dropRight(3))

        // 并集
        println("8:" + list1.union(list2))
        println("8:" + (list1 ::: list2))

        // 交集
        println("9:" + list1.intersect(list2))

        // 差集
        println("10:" + list1.diff(list2))
        println("10:" + list2.diff(list1))

        // 拉链
        println("11:" + list1.zip(list2))

        // 滑窗
        list1.sliding(3).foreach(list => println(s"12:${list}"))
        println("-----------------------------------------------")
        list1.sliding(3,2).foreach(list => println(s"12:${list}"))

    }
}
