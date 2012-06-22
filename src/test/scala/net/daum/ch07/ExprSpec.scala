package net.daum.ch07
import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ExprSpec extends Specification {

  "Number[n]" should {
    val n = Number(3)
    "return 'Number(n)' as toString return value" in {
      n.toString must equalTo("Number(3)")
    }
    "return n as eval return value" in {
      n.eval must equalTo(3)
    }
  }

  "Sum[l, r]" should {
    val sum = Sum(Number(3), Number(5))
    "return 'Sum(l.toString, r.toString)' as toString return value" in {
      sum.toString must equalTo("Sum(Number(3),Number(5))")
    }
    "return l.eval+r.eval as eval return value" in {
      sum.eval must equalTo(8)
    }
  }

  "Prod[l, r]" should {
    val n1 = Number(3)
    val n2 = Number(5)
    val sum1 = Sum(n1, n2)
    val sum2 = Sum(n2, n1)
    val prod = Prod(sum1, sum2)
    "return 'Prod(l.toString, r.toString)' as toString return value" in {
      prod.toString must equalTo("Prod(Sum(Number(3),Number(5)),Sum(Number(5),Number(3)))")
    }
    "return l.eval*r.eval as eval return value" in {
      prod.eval must equalTo(64)
    }
  }
}