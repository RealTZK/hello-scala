package chapter08

object Test05_MatchCaseClass {
    def main(args: Array[String]): Unit = {
        val student = Student1("tzk", 23)

        val result = student match {
            case Student1("tzk", 22) => "tzk,22"
            case Student1("tzk", 23) => "tzk,23"
            case _ => "Else"
        }
        println(result)
    }
}

// 创建样例类
case class Student1(name: String, age: Int)
