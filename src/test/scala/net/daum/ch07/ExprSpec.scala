package net.daum.ch07
import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ExprSpec extends Specification {

  "Number.toString" should {
    "return 'Number(n)'" in {
      Number(3).toString must equalTo("Number(3)")
    }
  }

  "Sum.toString" should {
    "return 'Sum(e1.toString, e2.toString)'" in {
      val sum = Sum(Number(3), Number(5))
      sum.toString must equalTo("Sum(Number(3),Number(5))")
    }
  }

  "Prod.toString" should {
    "return 'Prod(e1.toString, e2.toString)'" in {
      val sum1 = Sum(Number(3), Number(5))
      val sum2 = Sum(Number(5), Number(3))
      val prod = Prod(sum1, sum2);
      prod.toString must equalTo("Prod(Sum(Number(3),Number(5)),Sum(Number(5),Number(3)))")
    }
  }

}