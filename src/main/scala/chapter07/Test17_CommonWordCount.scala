package chapter07

object Test17_CommonWordCount {
    def main(args: Array[String]): Unit = {
        val strings = List(
            "hello",
            "hello world",
            "hello scala",
            "hello spark from scala",
            "hello flink from scala"
        )

        val result = strings.flatMap(_.split(" "))
                .groupBy(_.toString)
                .map(kv => kv._1 -> kv._2.size)
                .toList
                .sortWith(_._2 > _._2)
                .take(3)

        println(result)
    }
}
