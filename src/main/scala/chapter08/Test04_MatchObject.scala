package chapter08

object Test04_MatchObject {
    def main(args: Array[String]): Unit = {
        val student = new Student("tzk", 23)

        // 针对对象实例的内容进行匹配
        val result = student match {
            case Student("tzk", 22) => "tzk,22"
            case Student("tzk", 23) => "tzk,23"
            case _ => "Else"
        }

        println(result)
    }
}

class Student(val name: String, val age: Int)

object Student {
    def apply(name: String, age: Int) = new Student(name, age)

    // 必须实现一个unapply方法,用来对对象属性进行拆解
    def unapply(student: Student) = Option.apply(student.name, student.age)
}
