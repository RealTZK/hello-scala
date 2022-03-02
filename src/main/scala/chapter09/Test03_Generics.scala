package chapter09

object Test03_Generics {
    def main(args: Array[String]): Unit = {

        // 1.协变和逆变
        val child = new Child
        val childList: MyCollection[SubChild] = new MyCollection[Child]

        // 2.上下限
        def test[A <: Child](a: A) = println(a.getClass.getName)

        test[Child](new Child)
        test[Child](new SubChild)
    }
}

class Parent

class Child extends Parent

class SubChild extends Child

class MyCollection[-E]
