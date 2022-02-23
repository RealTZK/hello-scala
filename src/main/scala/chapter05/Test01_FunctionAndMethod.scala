package chapter05

object Test01_FunctionAndMethod {
    def main(args: Array[String]): Unit = {
        // 定义函数
        def sayHi(name: String): Unit = {
            println("hi," + name)
        }

        // 调用函数
        sayHi("tzk")

        // 调用对象方法
        this.sayHi("tzk")

        // 获取方法返回值
        val hello = sayHello("tzk")
        println(hello)
    }

    // 定义对象的方法
    def sayHi(name: String): Unit = {
        println("Hi," + name)
    }

    def sayHello(name: String): String = {
        println("Hello," + name)
        "Hello"
    }
}
