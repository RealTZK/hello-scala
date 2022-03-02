package chapter08

object Test01_PatternMatchBase {
    def main(args: Array[String]): Unit = {
        // 基本定义
        val x = 2
        val y = x match {
            case 1 => "one"
            case 2 => "two"
            case 3 => "three"
            case _ => "other"
        }
        println(y)

        // 2.示例:用模式匹配实现简单计算器
        val a = 25
        val b = 13

        def calculator(op: Char)(a: Int, b: Int) = op match {
            case '+' => a + b
            case '-' => a - b
            case '*' => a * b
            case '/' => a / b
            case _ => "非法"
        }

        println(calculator('-')(a, b))
        println(calculator('$')(a, b))

        println("===============================================")

        // 3.模式守卫
        def abs(num: Int) = {
            num match {
                case i if i >= 0 => i
                case i if i < 0 => -i
            }
        }

        println(abs(1))
        println(abs(0))
        println(abs(-1))

    }
}
