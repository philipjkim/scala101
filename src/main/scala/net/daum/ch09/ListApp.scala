package net.daum.ch09

object ListApp extends App {
  val fruit = "apples" :: "oranges" :: "pears" :: Nil
  println(fruit)

  def tailRecursiveLength(l: List[Int]) = {
    def length2(l: List[Int], acc: Int): Int = l match {
      case Nil => acc
      case x :: xs => length2(xs, acc + 1)
    }
    length2(l, 0)
  }
  println(List(1, 2, 3, 4, 5).length)
  println(tailRecursiveLength(List(1, 2, 3, 4, 5)))

  println(List.range(1, 7)
    .flatMap(i => List.range(1, i).map(x => (i, x)))
    .filter(pair => PrimeUtils.isPrime(pair._1 + pair._2)))
}