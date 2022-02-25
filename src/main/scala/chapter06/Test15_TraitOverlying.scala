package chapter06

object Test15_TraitOverlying {
    def main(args: Array[String]): Unit = {
        val student = new Student15
        student.increase

        // 钻石问题 特征叠加
        val ball = new MyFootBall
        println(ball.describe)
    }
}

// 定义球类特征
trait Ball {
    def describe = "ball"
}

// 定义颜色特征
trait ColorBall extends Ball {
    var color = "RED"

    override def describe: String = color + "-" + super.describe
}

// 定义种类特征
trait CategoryBall extends Ball {
    var category = "FOOT"

    override def describe: String = category + "-" + super.describe
}

// 定义一个自定义球的类
class MyFootBall extends CategoryBall with ColorBall {
    override def describe: String = "my ball is a " + super[ColorBall].describe
}

trait Knowledge15 {
    var amount: Int = 0

    def increase = println("Knowledge increased")
}

trait Talent15 {
    def singing

    def dancing

    def increase = println("Talent increased")
}

class Student15 extends Person13 with Talent15 with Knowledge15 {
    override def singing: Unit = println("singing")

    override def dancing: Unit = println("dancing")

    override def increase: Unit = super[Person13].increase
}
