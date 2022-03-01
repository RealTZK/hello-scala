package chapter07

object Test11_CommonOp {
    def main(args: Array[String]): Unit = {
        val list = List(1, 3, 5, 7, 9)
        val set = Set(1, 3, 5, 7, 9)

        // 集合长度
        println(list.length)
        println("==============================")

        // 集合大小
        println(set.size)
        println("==============================")

        // 遍历
        list.foreach(println)
        println("==============================")

        // 迭代器
        list.iterator.foreach(println)
        println("==============================")

        // 是否包含
        println(list.contains(0))
        println(list.contains(1))
    }
}
