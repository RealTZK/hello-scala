package chapter07

import scala.collection.mutable

object Test09_MutableMap {
    def main(args: Array[String]): Unit = {
        val map1 = mutable.Map("a" -> 12, "b" -> 25, "h" -> 3)
        println(map1)
        println(map1.getClass)

        map1.put("c", 11)
        map1.put("d", 9)
        println(map1)

        map1 += (("a", 11))
        println(map1)

        map1.remove("h")
        map1 -= "a"
        println(map1)

        val map2 = Map("i" -> 12, "j" -> 25, "k" -> 3, "d" -> 10)
        map1 ++= map2
        println(map1)
    }
}
