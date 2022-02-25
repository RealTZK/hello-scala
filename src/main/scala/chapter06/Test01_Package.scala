// 用嵌套风格定义包
package top {

    import top.tzk.scala.Inner

    // 在外层包中定义单例对象
    object Outer {
        var out = "out"

        def main(args: Array[String]): Unit = {
            println(Inner.in)
        }
    }
    package tzk {
        package scala {
            // 内层包中定义单例对象
            object Inner {
                val in = "in"

                def main(args: Array[String]): Unit = {
                    println(Outer.out)
                    Outer.out = "outer"
                    println(Outer.out)
                }
            }
        }

    }

}

// 在同一文件中定义多个包
package aaa {
    package bbb {

        import top.tzk.scala.Inner

        object Test01_Package {
            def main(args: Array[String]): Unit = {
                println(Inner.in)
            }
        }
    }

}