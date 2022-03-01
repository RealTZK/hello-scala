package chapter07

import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
    def main(args: Array[String]): Unit = {
        // 1.创建可变数组
        val arr1 = new ArrayBuffer[Int]()
        val arr2 = ArrayBuffer(11, 22, 33, 44, 55)

        println(arr1.mkString(","))
        println(arr2)

        // 2.访问可变数组
        // println(arr1(0)) // error
        println(arr2(1))
        arr2(1) = 66
        println(arr2(1))

        println("=================================")

        // 3.添加元素
        val newArr1 = arr1 :+ 1
        println(arr1)
        println(newArr1)

        val newArr2 = arr1 += 1
        println(arr1)
        println(newArr2)
        println(arr1 == newArr2)
        newArr2 += 3
        println(newArr2)

        5 +=: arr1
        println(arr1)

        arr1.append(7)
        arr1.prepend(9, 11)
        println(arr1)
        arr1.insert(1, 13, 15)
        println(arr1)

        // 4.删除元素
        arr1.remove(3)
        println(arr1)
        arr1.remove(0, 3)
        println(arr1)

        arr1 -= 7
        println(arr1)

        // 5.可变 不可变 互相转化
        val arr = ArrayBuffer(0, 2, 4, 6, 8)
        val newArr = arr.toArray
        println(arr)
        println(newArr.mkString(","))

        val buffer = newArr.toBuffer
        println(buffer)
    }
}
