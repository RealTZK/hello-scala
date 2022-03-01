package chapter07

object Test20_Parallel {
    def main(args: Array[String]): Unit = {
        val result = (1 to 100)
                .map(_ => Thread.currentThread().getName)
        println(result)

        val result2 = (1 to 100).par
                .map(_ => Thread.currentThread().getId)
        println(result2)
    }
}
