package chapter05

object Test03_FunctionParameter {
    def main(args: Array[String]): Unit = {
        // 1.可变参数
        def f1(str: String*): Unit = {
            println(str)
        }

        f1("tzk")
        f1("tzk", "jxd")

        // 2.可变参数放最后
        def f2(str1: String, str2: String*): Unit = {
            println("str1:" + str1)
            println("str2:" + str2)
        }

        f2("tzk")
        f2("tzk", "jxd", "tsy")

        // 3.参数默认值
        def f3(name: String = "default"): Unit = {
            println(name)
        }

        f3("tzk")
        f3()

        // 4.带名参数
        def f4(name: String = "tzk", age: Int): Unit = {
            println(s"${name}${age}岁")
        }

        f4("jxd", 23)
        f4(age = 23)
    }
}
