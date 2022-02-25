package chapter06

object Test13_Trait {
    def main(args: Array[String]): Unit = {
        val student1 = new Student13
        student1.sayHello
        student1.study
        student1.dating
        student1.play
        println(student1.isAdult)
    }
}

class Person13 {
    val name = "person"
    var age = 18

    def sayHello = println("hello from: " + name)

    def increase = println(" Person increased")
}

trait Young {
    var age: Int
    val name = "young"

    def play = println("young people is playing")

    def dating
}

class Student13 extends Person13 with Young {
    // 重写冲突的属性
    override val name: String = "student"

    override def dating: Unit = println(s"student $name is dating")

    def study: Unit = println(s"student $name is studying")

    override def sayHello: Unit = {
        super.sayHello
        println(s"hello from:student $name")
    }

    def isAdult = age >= 18
}