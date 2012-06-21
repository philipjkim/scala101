package net.daum.ch05

import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SummationUtilsSpec extends Specification {

  "sumInts" should {
    "return sum between two integer parameters" in {
      SummationUtils.sumInts(1, 5) must equalTo(15)
    }
  }

  "sumSquares" should {
    "return sum of squares between two integer parameters" in {
      SummationUtils.sumSquares(1, 5) must equalTo(55)
    }
  }

  "sumPowerOfTwo" should {
    "return sum of power of 2 between two integer parameters" in {
      SummationUtils.sumPowerOfTwo(1, 5) must equalTo(62)
    }
  }
}