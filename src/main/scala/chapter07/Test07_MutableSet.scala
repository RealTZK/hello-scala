package chapter07

import scala.collection.mutable

object Test07_MutableSet {
    def main(args: Array[String]): Unit = {
        val set1 = mutable.Set(1, 3, 5, 1, 7, 9)
        println(set1)

        set1 += 11
        println(set1)

        set1.add(13)
        println(set1)

        set1 -= 11
        println(set1)

        val set2 = mutable.Set(0, 2, 4, 6, 8, 1, 3)
        set1 ++= set2
        println(set1)
    }
}
