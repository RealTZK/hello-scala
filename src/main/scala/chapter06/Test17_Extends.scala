package chapter06

object Test17_Extends {
    def main(args: Array[String]): Unit = {
        // 1.类型的检测和转换
        val tzk = new Student17("tzk", 23)
        tzk.study
        tzk.sayHi
        val person: Person17 = new Student17("jxd", 23)
        person.sayHi

        println("tzk is Student17: " + tzk.isInstanceOf[Student17])
        println("tzk is Person17: " + tzk.isInstanceOf[Person17])
        println("person is Person17: " + person.isInstanceOf[Person17])
        println("person is Student17: " + person.isInstanceOf[Student17])

        val person2: Person17 = new Person17("tsy", 23)
        println("person2 is Student17: " + person2.isInstanceOf[Student17])

        // 类型的转换
        if (person.isInstanceOf[Student17]) person.asInstanceOf[Student17].study

        println(classOf[Student17])

        // 2.枚举类
        println(WorkDay.MONDAY)
    }
}

class Person17(val name: String, val age: Int) {
    def sayHi = println("hi from person:" + name)
}

class Student17(name: String, age: Int) extends Person17(name, age) {
    override def sayHi: Unit = println("hi from student:" + name)

    def study = println("student study")
}

// 定义枚举类对象
object WorkDay extends Enumeration {
    val MONDAY = Value(1, "Monday")
    val TUESDAY = Value(2, "Tuesday")
}

// 定义应用类
object TestApp extends App {
    println("app start")

    type MyString = String
    val a: MyString = "abc"
    println(a)
}
