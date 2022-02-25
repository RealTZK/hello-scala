package chapter06

object Test10_AnonymousClass {
    def main(args: Array[String]): Unit = {
        new Person10 {
            override val name: String = "tzk"

            override def eat: Unit = println(s"$name eat")
        }.eat
    }
}

abstract class Person10 {
    val name: String

    def eat: Unit
}

