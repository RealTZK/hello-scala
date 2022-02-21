package chapter02

object Test03_Identifier {
    def main(args: Array[String]): Unit = {
        // (1) 以数字或者下划线开头,后接字母、数字、下划线
        val hello = ""
        var Hello123 = ""
        val _abc = 123

        /*
        not found: value -
        val h-b = ""
         */
        // val h-b = ""
        // val 123abc = 234

        // (2) 以操作符开头,且只包含操作符(+ - * / # ! 等)
        val --- = "---"
        println(---)

        // (3) 用反引号``包括的任意字符串,即使是Scala关键字也可以
        val `if` = "if"
        println(`if`)

    }
}
