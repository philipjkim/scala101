package net.daum.function

object FixedPointFinder {

  val tolerance = 0.0001
  def isCloseEnough(x: Double, y: Double) = {
    def abs(a: Double) = if (a >= 0) a else -a
    abs((x - y) / x) < tolerance
  }
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      println(next)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }
}

object FixedPointFinderRunner extends App {
  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
  def sqrt(x: Double) = FixedPointFinder.fixedPoint(averageDamp(y => x / y))(1.0)
  sqrt(2.0)
}