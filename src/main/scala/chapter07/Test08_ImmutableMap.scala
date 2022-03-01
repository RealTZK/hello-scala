package chapter07

object Test08_ImmutableMap {
    def main(args: Array[String]): Unit = {
        val map1: Map[String, Int] = Map(("a", 12), ("b", 25), ("h", 3))
        val map2: Map[String, Int] = Map("a" -> 12, "b" -> 25, "h" -> 3)
        println(map1)
        println(map2)
        println(map1.getClass)

        map1.foreach(println)
        map1.foreach((kv => println(s"${kv._1} -> ${kv._2}")))

        println("=========================================================")

        // 取出map中所有的key或value
        map1.keys.foreach(k => println(s"$k -> ${map1.get(k)}"))

        println(map1.get("a").get)
        println(map1.get("c"))
        println(map1.getOrElse("c", 0))
        println(map1("a"))
    }
}
