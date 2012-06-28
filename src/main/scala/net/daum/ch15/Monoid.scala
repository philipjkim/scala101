package net.daum.ch15

abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}

object stringMonoid extends Monoid[String] {
  def add(x: String, y: String) = x.concat(y)
  def unit = ""
}

object intMonoid extends Monoid[Int] {
  def add(x: Int, y: Int) = x + y
  def unit = 0
}

object MonoidApp extends App {
  def sum[A](xs: List[A])(m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail)(m))

  println(sum(List("a", "bc", "def"))(stringMonoid))
  println(sum(List(1, 2, 3))(intMonoid))
}