package chapter05

/**
 * 函数至简原则
 */
object Test04_Simplify {
    def main(args: Array[String]): Unit = {
        def f0(name: String): String = {
            return name
        }

        println(f0("tzk"))
        println("===========================================")

        // 1.return可以省略,Scala会使用函数体的最后一行代码作为返回值
        def f1(name: String): String = {
            name
        }

        println(f1("tzk"))
        println("===========================================")

        // 2.如果只有一行代码,可以省略"{}"
        def f2(name: String): String = name

        println(f2("tzk"))
        println("===========================================")

        // 3.如果返回值类型可以推断出来,那么可以省略
        def f3(name: String) = name

        println(f3("tzk"))
        println("===========================================")

        // 4.如果有return,则不能省略返回值,必须指定
        // def f4(name: String) = {
        //     return name
        // } 方法 f4 包含 return 语句；需要结果类型

        println("===========================================")

        // 5.如果函数声明Unit,那么即使函数体中使用return关键字也不起作用
        def f5(name: String): Unit = {
            return name
        }

        println(f5("tzk"))
        println("===========================================")

        // 6.如果期望是无返回值类型,可以省略等号
        def f6(name: String) {
            println(name)
        }

        println(f6("tzk"))
        println("===========================================")

        // 7.如果函数无参,但是声明了参数列表,那么调用时,小括号,可加可不加
        def f7() {
            println("tzk")
        }

        println(f7)
        println("===========================================")

        // 8.如果函数没有参数列表,那么小括号可以省略,那么调用时小括号必须省略
        def f8 {
            println("tzk")
        }

        // println(f8()) // f8 不接受形参
        println(f8)
        println("===========================================")

        // 9.如果不关心名称,只关心逻辑处理,那么函数声明可以省略(匿名函数,lambda表达式)
        (name: String) => println(name)

    }
}
