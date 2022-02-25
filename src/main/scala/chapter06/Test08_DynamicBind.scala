package chapter06

object Test08_DynamicBind {
    def main(args: Array[String]): Unit = {
        val student: Person8 = new Student8
        println(student.name)
    }
}

class Person8 {
    val name = "person"
}

class Student8 extends Person8 {
    override val name = "student"
}
