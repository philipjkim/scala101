package net.daum.ch09

object IntSorter {

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insert(x, isort(xs1))
  }

  private def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }

  def msort(xs: List[Int]): List[Int] = {
    def merge(xs1: List[Int], xs2: List[Int]): List[Int] =
      if (xs1.isEmpty) xs2
      else if (xs2.isEmpty) xs1
      else if (xs1.head < xs2.head) xs1.head :: merge(xs1.tail, xs2)
      else xs2.head :: merge(xs1, xs2.tail)
    val n = xs.length / 2
    if (n == 0) xs
    else merge(msort(xs take n), msort(xs drop n))
  }
}