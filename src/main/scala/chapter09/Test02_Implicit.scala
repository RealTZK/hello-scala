package chapter09

object Test02_Implicit {
    def main(args: Array[String]): Unit = {
        val new12 = new MyRichInt(12)
        println(new12.myMax(15))

        // 1.隐式函数
        implicit def convert(num: Int) = new MyRichInt(num)

        println(12.myMax(15))
        println(12.myMin(15))

        println("=================================")

        // 2.隐式类
        implicit class MyRichInt2(val self: Int) {
            def myMax2(n: Int): Int = Math.max(self, n)

            def myMin2(n: Int): Int = Math.min(self, n)
        }
        println(12.myMin2(13))

        println("=================================")

        // 3.隐式参数
        implicit val str = "jxd"

        def sayHello()(implicit name: String) = println("hello, " + name)

        def sayHi(implicit name: String) = println("hi, " + name)

        def sayNice(implicit name: String = "jxdnb") = println("nice, " + name)

        def sayNice1()(implicit name: String = "jxdnb") = println("nice1, " + name)

        sayHello()
        sayHi
        sayNice // nice, jxd
        sayNice() // nice, jxdnb
        sayNice1 // nice1, jxd
        sayNice1() // nice1, jxd

        // 简便写法
        implicit val age = 23

        def hiAge() = println("hi," + implicitly[Int])

        hiAge

    }
}

class MyRichInt(val self: Int) {
    def myMax(n: Int): Int = Math.max(self, n)

    def myMin(n: Int): Int = Math.min(self, n)
}
