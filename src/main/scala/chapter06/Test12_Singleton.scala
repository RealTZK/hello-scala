package chapter06

object Test12_Singleton {
    def main(args: Array[String]): Unit = {
        val instance = Student12.getInstance
        instance.printInfo
        val instance1 = Student12.getInstance
        println(instance == instance1)
    }
}

class Student12 private(val name: String, val age: Int) {
    def printInfo = println(s"student: name = $name age = $age")
}

// 饿汉式
//object Student12 {
//    private val instance = new Student12("tzk",23)
//
//    def getInstance = instance
//}

// 懒汉式
object Student12 {
    private var instance: Student12 = _

    def getInstance = {
        if (instance == null) {
            instance = new Student12("tzk", 23)
        }
        instance
    }
}