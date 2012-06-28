package net.daum.ch15

abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}

object MonoidApp extends App {
  implicit object stringMonoid extends Monoid[String] {
    def add(x: String, y: String) = x.concat(y)
    def unit = ""
  }

  implicit object intMonoid extends Monoid[Int] {
    def add(x: Int, y: Int) = x + y
    def unit = 0
  }

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))

  println(sum(List("a", "bc", "def")))
  println(sum(List(1, 2, 3)))
}