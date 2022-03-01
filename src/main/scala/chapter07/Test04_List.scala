package chapter07

object Test04_List {
    def main(args: Array[String]): Unit = {
        // 1.创建一个List
        val list1 = List.apply(1, 4, 7, 2, 5, 8)
        println(list1)

        // 2.访问和遍历List
        println(list1(1))
        list1.foreach(println)

        // 3.添加元素
        val list2 = list1 :+ 10
        val list3 = 10 +: list1
        println(list1)
        println(list2)
        println(list3)

        val list4 = list2.::(51)
        println(list4)

        val list5 = Nil.::(13)
        println(list5)

        val list6 = 32 :: Nil
        val list7 = 17 :: 25 :: 56 :: 16 :: Nil
        println(list7)
    }
}
