package net.daum.ch05

object SummationUtils {

  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }

  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)

  def sumInts = sum(x => x)
  def sumSquares = sum(x => x * x)
  def sumPowerOfTwo = sum(powerOfTwo)
}

object SummationUtilsRunner extends App {
  println("sumInts(1,5)=%d".format(SummationUtils.sumInts(1, 5)))
  println("sumSquares(1,5)=%d".format(SummationUtils.sumSquares(1, 5)))
  println("sumPowerOfTwo(1,5)=%d".format(SummationUtils.sumPowerOfTwo(1, 5)))
}