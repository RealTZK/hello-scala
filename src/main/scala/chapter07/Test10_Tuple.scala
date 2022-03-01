package chapter07

object Test10_Tuple {
    def main(args: Array[String]): Unit = {
        val tuple = ("hello", 100, 'a', true)
        println(tuple)

        println(tuple._1)
        println(tuple.productElement(1))

        for (elem <- tuple.productIterator) {
            println(elem)
        }
        println("===========================")
        tuple.productIterator.foreach(println)

        val mulTuple = (("a", 1), ("b", 2), 'c', "d")
        println(mulTuple._1._1)
    }
}
