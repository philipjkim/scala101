package net.daum.higherorderfunc

object SummationUtils {

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b)

  def square(x: Int) = x * x
  def sumSquares(a: Int, b: Int): Int =
    if (a > b) 0 else square(a) + sumSquares(a + 1, b)

  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)
  def sumPowerOfTwo(a: Int, b: Int): Int =
    if (a > b) 0 else powerOfTwo(a) + sumPowerOfTwo(a + 1, b)
}

object SummationUtilsRunner extends App {
  println("sumInts(1,5)=%d".format(SummationUtils.sumInts(1, 5)))
  println("sumSquares(1,5)=%d".format(SummationUtils.sumSquares(1, 5)))
  println("sumPowerOfTwo(1,5)=%d".format(SummationUtils.sumPowerOfTwo(1, 5)))
}