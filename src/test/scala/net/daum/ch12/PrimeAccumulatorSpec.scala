package net.daum.ch12
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification
import net.daum.ch12.PrimeAccumulator._

@RunWith(classOf[JUnitRunner])
class PrimeAccumulatorSpec extends Specification {

  "imperativeSum" should {
    "return the sum of primes between start and end" in {
      imperativeSum(2, 10) must equalTo(2 + 3 + 5 + 7)
    }
  }

  "functionalSum" should {
    "return the same result to imperativeSum" in {
      functionalSum(2, 10) must equalTo(imperativeSum(2, 10))
    }
  }
}