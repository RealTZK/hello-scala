package chapter02

object Test04_String {
    def main(args: Array[String]): Unit = {
        // (1) 字符串.通过'+'连接
        val name = "tzk";
        val age = 23
        println(age + "岁的" + name + "在hrbust学习")

        // '*'用于将一个字符串复制多次拼接
        println(name * 3)

        // (2) printf用法:字符串,通过'%'传值
        printf("%d岁的%s在bilibili学习", age, name)
        println()

        // (3) 字符串模板(插值字符串):通过$获取变量值
        println(s"${age}岁的${name}在bilibili学习")

        val num = 2.1415926
        println(f"The num is ${num}%2.3f") // 格式化模板字符串
        println(raw"The num is ${num}%2.3f")

        // 三引号表示字符串,保持多行字符串的原格式输出
        val sql =
            s"""
               |select
               |    *
               |from
               |    student
               |where
               |    name <> ${name}
               |    AND age > ${age}
               |""".stripMargin
        println(sql)
    }
}
