package chapter05

/**
 * 函数至简原则
 */
object Test07_Practice_CollectionOperation {
    def main(args: Array[String]): Unit = {

        val array = Array(1, 2, 3, 4, 5, 6, 7, 8)

        // 对数组进行处理,将操作抽象出来
        def arrayOperation(array: Array[Int], op: Int => Int) = {
            for (elem <- array) yield op(elem)
        }

        // 定义一个加一操作
        def addOne(elem: Int): Int = elem + 1

        // 调用函数
        val newArray = arrayOperation(array, addOne)
        println(newArray.mkString(","))

        // 传入匿名操作,实现元素翻倍
        val newArray2 = arrayOperation(array, _ * 2)
        println(newArray2.mkString(","))

    }
}
