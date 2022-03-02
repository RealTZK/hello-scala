package chapter09

object Test01_Exception {
    def main(args: Array[String]): Unit = {
        try {
            val i = 10 / 0
        } catch {
            case e: ArithmeticException => {
                println("算术异常")
            }
            case e: Exception => {
                println("一般异常")
            }
        } finally {
            println("finally")
        }
    }
}
