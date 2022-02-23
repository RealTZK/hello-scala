package chapter05

object Test02_FunctionDefine {
    def main(args: Array[String]): Unit = {
        // 1.无参无返回值
        def f1(): Unit = {
            println("1.无参,无返回值")
        }

        println(f1())

        // 2.无参,有返回值
        def f2(): Int = {
            println("2.无参,有返回值")
            12
        }

        println(f2())

        // 3.有参数,无返回值
        def f3(name: String): Unit = {
            println("3.有参数,无返回值 " + name)
        }

        println(f3("tzk"))

        // 4.有参数,有返回值
        def f4(name: String): String = {
            println("4.有参数,有返回值 " + name)
            "hi," + name
        }

        println(f4("tzk"))

        // 5.多参数,无返回值
        def f5(name1: String, name2: String): Unit = {
            println("5.多参数,无返回值")
            println(s"name1:${name1},name2:${name2}")
        }

        println(f5("tzk","jxd"))

        // 6.多参数,有返回值
        def f6(a: Int, b: Int): Int = {
            println("6.多参数,有返回值")
            a + b
        }

        println(f6(22,23))


    }
}
