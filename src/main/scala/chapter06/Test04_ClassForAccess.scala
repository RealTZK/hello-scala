package chapter06

object Test04_ClassForAccess {

}

// 定义一个父类
class Person {
    private var idCard = "412825199807157616"
    protected var name = "tzk"
    var sex = "female"
    private[chapter06] var age = 23

    override def toString = s"Person(idCard=$idCard, name=$name, sex=$sex, age=$age)"
}
