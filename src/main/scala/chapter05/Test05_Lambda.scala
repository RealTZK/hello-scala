package chapter05

/**
 * 函数至简原则
 */
object Test05_Lambda {
    def main(args: Array[String]): Unit = {

        val fun = (name: String) => println(name)
        fun("tzk")

        // 定义一个函数,以函数作为参数输入
        def f(func: String => Unit): Unit = {
            func("tzk")
        }

        f(fun)
        f(Predef.println)

        // 匿名函数的简化原则
        // <1> 参数的类型可以省略,会根据形参进行自动推导
        // <2> 如果只有一个参数,括号可以省略
        // <3> 如果函数体只有一行,则大括号可以省略
        // <4> 如果参数只出现一次,则参数省略且后面参数可以用_代替
        f(println(_))

        // <5> 如果可以推断出,当前传入的println是一个函数体,而不是调用语句,可以省略下划线
        f(println)

        // 实际示例,定义一个"二元运算"函数,只操作1和2两个数,但是具体运算通过参数传入
        def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
            fun(1, 2)
        }

        val add = (a: Int, b: Int) => a + b
        val minus = (a: Int, b: Int) => a - b
        println(dualFunctionOneAndTwo(add))
        println(dualFunctionOneAndTwo(minus))

        // 匿名函数简化
        println(dualFunctionOneAndTwo((a: Int, b: Int) => a + b))
        println(dualFunctionOneAndTwo(_ + _))

    }
}
