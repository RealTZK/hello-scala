package chapter07

object Test06_ImmutableSet {
    def main(args: Array[String]): Unit = {
        val set1 = Set(1, 3, 5, 1, 7, 9)
        println(set1)

        val set2 = set1 + 20
        val set3 = set2 + 9
        println(set2)
        println(set3)

        val set4 = Set(0, 2, 4, 6, 8, 1, 3, 4)
        val set5 = set1 ++ set4
        println(set5)

        val set6 = set1 - 9
        println(set6)
    }
}
