package net.daum.ch08

object Calculator {
  def divmod(x: Int, y: Int) = new Tuple2[Int, Int](x / y, x % y)
}