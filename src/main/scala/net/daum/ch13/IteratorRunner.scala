package net.daum.ch13
import Iterator._

object IteratorRunner extends App {
  val it: Iterator[Int] = range(1, 10)
  while (it.hasNext) {
    val x = it.next
    println("%d ^ 2 = %d".format(x, x * x))
  }

  val xs = Array(1, 2, 3)
  val limit = 1
  fromArray(xs) foreach (println _)

  fromArray(xs)
    .zip(from(0))
    .filter(_._1 > limit)
    .map(_._2)
    .foreach(println _)
}