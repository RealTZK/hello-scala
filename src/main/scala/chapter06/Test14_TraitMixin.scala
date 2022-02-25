package chapter06

object Test14_TraitMixin {
    def main(args: Array[String]): Unit = {
        val student1 = new Student14
        student1.study
        student1.increase

        student1.play
        student1.increase

        student1.dating
        student1.increase

        println("================================")
        // 动态混入
        val student11 = new Student14 with Talent {
            override def singing: Unit = println("singing")

            override def dancing: Unit = println("dancing")
        }
        student11.singing
        student11.dancing
    }
}

// 再定义一个特质
trait Knowledge {
    var amount: Int = 0

    def increase
}

trait Talent {
    def singing

    def dancing
}

class Student14 extends Person13 with Young with Knowledge {
    override def increase: Unit = {
        amount += 1
        println(s"student $name knowledge increased $amount")
    }

    // 重写冲突的属性
    override val name: String = "student"

    override def dating: Unit = println(s"student $name is dating")

    def study = println(s"student $name is studying")

    override def sayHello: Unit = {
        super.sayHello
        println(s"hello from:student $name")
    }

    def isAdult = age >= 18
}