package net.daum.higherorderfunc

object SummationUtils {

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def id(x: Int) = x
  def square(x: Int) = x * x
  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)

  def sumInts(a: Int, b: Int): Int = sum(id, a, b)
  def sumSquares(a: Int, b: Int): Int = sum(square, a, b)
  def sumPowerOfTwo(a: Int, b: Int): Int = sum(powerOfTwo, a, b)
}

object SummationUtilsRunner extends App {
  println("sumInts(1,5)=%d".format(SummationUtils.sumInts(1, 5)))
  println("sumSquares(1,5)=%d".format(SummationUtils.sumSquares(1, 5)))
  println("sumPowerOfTwo(1,5)=%d".format(SummationUtils.sumPowerOfTwo(1, 5)))
}