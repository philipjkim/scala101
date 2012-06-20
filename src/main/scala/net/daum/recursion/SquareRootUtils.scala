package net.daum.recursion

class SquareRootUtils {

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))
    def improve(guess: Double) = (guess + x / guess) / 2
    def isGoodEnough(guess: Double) = abs(square(guess) - x) < 0.001
    def abs(x: Double) = if (x >= 0) x else -x
    def square(x: Double) = x * x

    sqrtIter(1.0)
  }
}

object SquareRootUtilsRunner extends App {
  val squareRootUtils = new SquareRootUtils()
  println("sqrt(4)=%f".format(squareRootUtils.sqrt(4)))
}