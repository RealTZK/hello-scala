package chapter07

object Test14_HighLevelFunction_Map {
    def main(args: Array[String]): Unit = {
        val list = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

        // 过滤
        println("1:" + list.filter(_ % 2 == 0)) // 选取偶数

        // 映射
        println("2:" + list.map(_ * 2)) // 把集合中每个数乘以2

        // 扁平化
        val nestedList = List(List(1, 2, 3), List(4, 5), List(6, 7, 8, 9))
        println("3:" + nestedList.flatten)

        // 扁平映射
        val strings = List("hello scala", "hello world", "hello java", "we study")
        println("4:" + strings.flatMap(_.split(" ")))

        // group by
        println("5:" + list.groupBy(data => if (data % 2 == 0) "偶数" else "奇数"))
        println("5:" + strings.groupBy(_.head))
    }
}
