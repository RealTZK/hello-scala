package chapter05

/**
 * 函数至简原则
 */
object Test08_Practice {
    def main(args: Array[String]): Unit = {
        // 练习1
        val fun = (i: Int, s: String, c: Char) =>
            if (i == 0 && s == "" && c == '0') false else true

        println(fun(0, "", '0'))
        println(fun(0, "", '1'))

        println("=======================================")

        // 练习2
        def func(i: Int): String => Char => Boolean = {
            def f1(s: String): Char => Boolean = {
                def f2(c: Char): Boolean = {
                    if (i == 0 && s == "" && c == '0') false else true
                }

                f2
            }

            f1
        }

        println(func(0)("")('0'))
        println(func(0)("1")('0'))

        // 匿名函数简写
        def func1(i: Int): String => Char => Boolean = {
            s => c => if (i == 0 && s == "" && c == '0') false else true
        }

        println(func1(0)("")('0'))
        println(func1(0)("1")('0'))

        // 柯里化
        def func2(i: Int)(s: String)(c: Char): Boolean = {
            if (i == 0 && s == "" && c == '0') false else true
        }

        println(func1(0)("")('0'))
        println(func1(0)("1")('0'))
    }
}
