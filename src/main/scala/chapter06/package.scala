package object chapter06 {
    // 定义当前包共享的属性和方法
    val commonName = "tzk"

    def commonMethod(): Unit = println(s"${commonName}在bilibili学习")
}

// 1.和Java一样,可以在顶部使用import导入,这个文件中的所有类都可以使用
// 2.局部导入,什么时候使用,什么时候导入.在其作用范围内部都可以使用
// 3.通配符导入,import java.util._
// 4.给类起名,import java.util.{ArrayList=>JL}
// 5.导入相同包的多个类,import java.util.{HashSet,ArrayList}
// 6.屏蔽类,import java.util.{ArrayList =>_,_}
// 7.导入包的绝对路径 new _root_.java.util.HashMap

// scala默认导入 java.lang._ scala._ scala.Predef._