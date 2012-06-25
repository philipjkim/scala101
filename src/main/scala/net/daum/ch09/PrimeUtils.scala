package net.daum.ch09

object PrimeUtils {
  def isPrime(n: Int) = List.range(2, n) forall (x => n % x != 0)
}