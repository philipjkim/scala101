package net.daum.ch07
import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ExprSpec extends Specification {

  "Number.toStr" should {
    "return a number as String" in {
      new Number(3).toStr must equalTo("3")
    }
  }

  "Sum.toStr" should {
    "return a string of (e1 + e2)" in {
      val n1 = new Number(3);
      val n2 = new Number(5);
      val sum = new Sum(n1, n2);
      sum.toStr must equalTo("(3 + 5)")
    }
  }

  "Prod.toStr" should {
    "return a string of (e1 * e2)" in {
      val n1 = new Number(3);
      val n2 = new Number(5);
      val prod = new Prod(n1, n2);
      prod.toStr must equalTo("(3 * 5)")
    }
  }
}