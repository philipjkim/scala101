package net.daum.ch08
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification

@RunWith(classOf[JUnitRunner])
class StackSpec extends Specification {

  "EmptyStack[String]" should {
    val stack = new EmptyStack[String]
    "be empty" in {
      stack.isEmpty must equalTo(true)
    }
    "return NonEmptyStack when push called" in {
      val pushed = stack.push("first string")
      pushed.getClass.getSimpleName must equalTo("NonEmptyStack")
      pushed.isEmpty must equalTo(false)
    }
  }

  "NonEmptyStack[String] pushed 'first' and 'second'" should {
    val emptyStack = new EmptyStack[String]
    val stack = emptyStack.push("first").push("second")
    "return 'first' when stack.pop.top called" in {
      stack.pop.top must equalTo("first")
    }
    "be a prefix of stack['zero', 'first', 'second']" in {
      val stack2 = emptyStack.push("zero").push("first").push("second")
      stack.isPrefixOf(stack2) must equalTo(true)
    }
  }
}