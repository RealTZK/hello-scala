package chapter06

object Test11_Object {
    def main(args: Array[String]): Unit = {
        // val tzk = new Student11("tzk", 23)
        val tzk = Student11.newStudent("tzk", 23)
        tzk.printInfo
        val jxd = Student11.apply("jxd", 23)
        jxd.printInfo
        val tsy = Student11("tsy", 23)
        tsy.printInfo
    }
}

// 定义类
class Student11 private(val name: String, val age: Int) {
    def printInfo = println(s"student: name = $name age = $age school = ${Student11.school}")
}

// 定义伴生对象
object Student11 {
    val school = "bilibili"

    // 定义一个类的对象实例的创建方法
    def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

    def apply(name: String, age: Int): Student11 = new Student11(name, age)
}
