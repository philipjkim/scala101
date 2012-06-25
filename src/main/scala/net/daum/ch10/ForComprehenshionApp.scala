package net.daum.ch10
import net.daum.ch09.PrimeUtils

object ForComprehenshionApp extends App {

  def getPrimePairs(maxNum: Int) = {
    for {
      i <- List.range(1, maxNum)
      j <- List.range(1, i)
      if PrimeUtils.isPrime(i + j)
    } yield (i, j)
  }
  println(getPrimePairs(7))
}