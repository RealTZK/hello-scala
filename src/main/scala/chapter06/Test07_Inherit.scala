package chapter06

object Test07_Inherit {
    def main(args: Array[String]): Unit = {
        val tzk = new Student7("tzk", 23)
        val jxd = new Student7("jxd", 23, "18")

        println(tzk.name)

        tzk.printInfo
        jxd.printInfo

        val teacher = new Teacher7
        teacher.printInfo

        def personInfo(person7: Person7) = person7.printInfo

        personInfo(teacher)
        personInfo(tzk)
    }
}

class Person7() {
    var name: String = _
    var age: Int = _

    println("1.父类的主构造器调用")

    def this(name: String, age: Int) = {
        this
        println("2.父类的辅助构造器调用")
        this.name = name
        this.age = age
    }


    def printInfo = println(s"Person: $name $age")
}

class Student7(name: String, age: Int) extends Person7/*(name, age)*/ {

    var sno: String = _

    println("3.子类的主构造器调用")

    def this(name: String, age: Int, sno: String) = {
        this(name, age)
        println("4.子类的辅助构造器调用")
        this.sno = sno
    }

    override def printInfo: Unit = println(s"Student: $name $age $sno")
}

class Teacher7 extends Person7 {
    override def printInfo: Unit = println(s"Teacher7")
}