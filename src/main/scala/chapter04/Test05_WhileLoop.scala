package chapter04

object Test05_WhileLoop {
    def main(args: Array[String]): Unit = {
        var i = 10
        while (i >= 1) {
            println("i = " + i)
            i -= 1
        }

        var j = 0
        do {
            println("j = " + j)
            j -= 1
        } while (j > 0)
    }
}
