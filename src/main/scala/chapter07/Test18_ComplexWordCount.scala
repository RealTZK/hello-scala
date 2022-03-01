package chapter07

object Test18_ComplexWordCount {
    def main(args: Array[String]): Unit = {
        val strings = List(
            "hello" -> 1,
            "hello world" -> 2,
            "hello scala" -> 3,
            "hello spark from scala" -> 1,
            "hello flink from scala" -> 2
        )

        val result = strings
                .flatMap(line => ((line._1 + " ") * line._2).split(" "))
                .groupBy(_.toString)
                .map(kv => kv._1 -> kv._2.size)
                .toList
                .sortWith(_._2 > _._2)
                .take(3)

        println("1:" + result)

        // 思路2:直接基于预统计的结果进行转换
        val result2 = strings
                .flatMap(line => line._1.split(" ").map(_ -> line._2))
                .groupBy(_._1)
                .mapValues(value => value.map(_._2).sum)
                .toList
                .sortWith(_._2 > _._2)
                .take(3)

        println("2:" + result2)

    }
}
