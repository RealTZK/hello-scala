package chapter07

import scala.collection.mutable
import scala.collection.immutable

object Test19_Queue {
    def main(args: Array[String]): Unit = {
        val queue = new mutable.Queue[String]

        queue.enqueue("a", "b", "c", "d")

        println(queue)
        println(queue.dequeue())
        println(queue)
        println(queue.dequeue())
        println(queue)

        queue.enqueue("d", "e", "f", "g")
        println(queue)

        println("==================================")

        val queue2 = immutable.Queue("a", "b", "c")
        val queue3 = queue2.enqueue("d")
        println(queue2)
        println(queue3)
    }
}
