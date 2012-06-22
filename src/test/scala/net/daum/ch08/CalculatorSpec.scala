package net.daum.ch08
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification

@RunWith(classOf[JUnitRunner])
class CalculatorSpec extends Specification{

  "Calculator.divmod" should {
    "return a Tuple(quotient, rest)" in {
      val tuple = Calculator.divmod(7,3)
      tuple._1 must equalTo(2)
      tuple._2 must equalTo(1)
    }
  }
}