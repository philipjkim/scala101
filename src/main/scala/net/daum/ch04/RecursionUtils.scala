package net.daum.ch04

object RecursionUtils {
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

  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def nonTailRecursiveFactorial(n: Int): Int = if (n == 0) 1 else n * nonTailRecursiveFactorial(n - 1)

  def tailRecursiveFactorial(n: Int): Int = {
    def fact(n: Int, acc: Int): Int = {
      if (n == 0) acc
      else fact(n - 1, n * acc)
    }
    fact(n, 1)
  }
}

object RecursionUtilsRunner extends App {
  println("sqrt(4)=%f".format(RecursionUtils.sqrt(4)))
  println("gcd(14, 21)=%d".format(RecursionUtils.gcd(14, 21)))
  println("nonTailRecursiveFactorial(5)=%d".format(RecursionUtils.nonTailRecursiveFactorial(5)))
  println("tailRecursiveFactorial(5)=%d".format(RecursionUtils.tailRecursiveFactorial(5)))
}