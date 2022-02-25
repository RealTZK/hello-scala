package chapter06

object Test04_Access {
    def main(args: Array[String]): Unit = {
        val person = new Person
        // person.idCard // 私有权限
        // person.name // 受保护权限
        println(person.age)
        println(person.sex)
        println(person.toString)

        val worker = new Worker
        println(worker.toString)
    }
}

// 定义一个子类
class Worker extends Person {

    override def toString = super.toString.replace("Person","Worker")

}