package chapter06

object Test02_PackageObject {
    def main(args: Array[String]): Unit = {
        println(commonName)
        commonMethod()
    }
}

package chapter06 {
    object Test02_PackageObject {
        def main(args: Array[String]): Unit = {
            println(commonName)
            commonMethod()
        }
    }
}

package ccc {
    package ddd {
        object Test02_PackageObject{
            def main(args: Array[String]): Unit = {
                println(school)
            }
        }
    }
}

// 定义一个包对象
package object ccc {
    val school = "bilibili"
}
