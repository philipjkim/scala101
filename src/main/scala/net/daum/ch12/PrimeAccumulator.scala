package net.daum.ch12

import net.daum.ch09.PrimeUtils._
import scala.collection.immutable.Stream._

object PrimeAccumulator {

  def imperativeSum(start: Int, end: Int) = {
    var i = start
    var acc = 0
    while (i < end) {
      if (isPrime(i)) acc += i
      i += 1
    }
    acc
  }

  private def sum(numbers: Stream[Int]) =
    numbers.foldLeft(0)((x, y) => x + y)

  def functionalSum(start: Int, end: Int) =
    sum(range(start, end) filter isPrime)

  def main(args: Array[String]) {
    println(imperativeSum(1, 10))
    println(functionalSum(1, 10))

    var started = System.currentTimeMillis()
    println(range(1000, 10000).filter(isPrime)(1))
    var elapsed = System.currentTimeMillis() - started
    println("Using Range elapsed %d ms" format elapsed)
    started = System.currentTimeMillis()
    println(List.range(1000, 10000).filter(isPrime)(1))
    elapsed = System.currentTimeMillis() - started
    println("Using List elapsed %d ms" format elapsed)
  }
}