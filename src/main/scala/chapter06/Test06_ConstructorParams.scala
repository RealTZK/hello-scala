package chapter06

object Test06_ConstructorParams {
    def main(args: Array[String]): Unit = {
        val student2 = new Student2
        student2.name = "tzk"
        student2.age = 23
        println(student2.toString)

        val student3 = new Student3("tzk",23)
        println(student3.toString)

        val student4 = new Student4("tzk",23)
        println(student4.toString)
        // println(student4.age) // error

        val student5 = new Student5("tzk", 23)
        // student5.age = 234 // error
    }
}

class Student2 {
    // 单独定义属性
    var name: String = _
    var age: Int = _

    override def toString = s"Student2(name=$name, age=$age)"
}

class Student3(var name: String, var age: Int) {

    override def toString = s"Student3($name, $age)"
}

class Student4(name: String,age: Int) {

    override def toString = s"Student4($name, $age)"
}

class Student44(_name: String,_age: Int) {
    var name = _name
    var age = _age
    override def toString = s"Student44($name, $age)"
}

class Student5(val name: String, val age: Int) {

    override def toString = s"Student5($name, $age)"
}