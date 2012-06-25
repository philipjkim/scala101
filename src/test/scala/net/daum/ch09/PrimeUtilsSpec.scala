package net.daum.ch09
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification

@RunWith(classOf[JUnitRunner])
class PrimeUtilsSpec extends Specification {
  "isPrime" should {
    "return true when the argument is a prime number" in {
      PrimeUtils.isPrime(5) must equalTo(true)
    }
    "return false when the argument is not a prime number" in {
      PrimeUtils.isPrime(6) must equalTo(false)
    }
  }
}