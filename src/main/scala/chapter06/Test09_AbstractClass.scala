package chapter06

object Test09_AbstractClass {
    def main(args: Array[String]): Unit = {
        val student = new Student9
        student.eat
        student.sleep
    }
}

abstract class Person9 {
    // 非抽象属性
    val name = "person"

    // 抽象属性
    val age: Int

    // 非抽象方法
    def eat = println("person eat")

    def sleep: Unit
}

class Student9 extends Person9{
    // 实现抽象属性
    val age: Int = 18

    // 实现抽象方法
    override def sleep: Unit = println("student sleep")

    // 重写非抽象属性
    override val name: String = "student"

    // 重写非抽象方法
    override def eat: Unit = println("student eat")
}