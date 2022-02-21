package chapter01

class Student(name: String, var age: Int) {
    def printInfo(): Unit = {
        println(name + " " + age + " " + Student.school)
    }
}

// 引入伴生对象
object Student {
    val school: String = "hrbust"

    def main(args: Array[String]): Unit = {
        val tzk = new Student("tzk", 20)
        val jxd = new Student("jxd", 23)

        tzk.printInfo()
        jxd.printInfo()
    }
}