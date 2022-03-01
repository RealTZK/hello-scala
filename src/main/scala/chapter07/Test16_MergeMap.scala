package chapter07

import scala.collection.mutable

object Test16_MergeMap {
    def main(args: Array[String]): Unit = {
        val map1 = Map(("a", 1), ("b", 2), ("c", 3))
        val map2 = mutable.Map(("a", 2), ("b", 4), ("c", 6), ("d", 8))

        println(map1.foldLeft(map2)((state, kv) => {
            state(kv._1) = state.getOrElse(kv._1, 0) + kv._2
            state
        }))
    }
}
