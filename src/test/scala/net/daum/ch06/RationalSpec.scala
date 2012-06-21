package net.daum.ch06
import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RationalSpec extends Specification {

  "square" should {
    "return a new rational with squared numer and denom" in {
      val squared = new Rational(3, 4).square
      squared.toString must equalTo("9/16")
    }
  }
}