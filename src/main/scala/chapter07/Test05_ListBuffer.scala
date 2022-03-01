package chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
    def main(args: Array[String]): Unit = {
        // 1.创建一个可变列表
        val list1 = new ListBuffer[Int]
        val list2 = ListBuffer(147, 258)

        println(list1)
        println(list2)

        println("========================================")

        // 2.添加元素
        list1.append(12, 23, 34)
        list2.prepend(369)
        list1.insert(3, 45, 56)

        println(list1)
        println(list2)

        list1 += 67 += 78
        1 +=: list1 += 89
        println(list1)

        println("========================================")

        // 3.合并list
        val list3 = list1 ++ list2
        println(list1)
        println(list2)
        println(list3)

        println("========================================")
        list1 ++= list2
        println(list1)
        println(list2)

        // 4.修改元素
        list2(1) = 111
        list2.update(0,0)
        println(list2)

        // 5.删除元素
        list2.remove(0)
        list2 -= 111
        println(list2)

    }
}
