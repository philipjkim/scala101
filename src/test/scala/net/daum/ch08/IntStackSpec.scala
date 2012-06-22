package net.daum.ch08
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification

@RunWith(classOf[JUnitRunner])
class IntStackSpec extends Specification {

  "IntEmptyStack" should {
    val s = new IntEmptyStack
    "be empty" in {
      s.isEmpty must equalTo(true)
    }
    /* TODO
    "raise error when top called" in {
      s.top must throwA[RuntimeException]
    }
    "raise error when pop called" in {
      s.pop must throwA[RuntimeException]
    }
     */
  }

  "IntNonEmptyStack[elem, rest]" should {
    val rest = new IntEmptyStack
    val s = new IntNonEmptyStack(1, rest)
    "not be empty" in {
      s.isEmpty must equalTo(false)
    }
    "return elem when top called" in {
      s.top must equalTo(1)
    }
    "return rest when pop called" in {
      s.pop must equalTo(rest)
    }
  }
}