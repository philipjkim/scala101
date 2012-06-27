package net.daum.ch11
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification
import net.daum.ch11.LoopUtils._

@RunWith(classOf[JUnitRunner])
class LoopUtilsSpec extends Specification {
  "whileLoop" should {
    "repeat command while the condition is true" in {
      var i = 0
      whileLoop(i < 3) { i += 1 }
      i must equalTo(3)
    }
  }
  "repeatLoop" should {
    "repeat command until the condition becomes true" in {
      var i = 0
      repeatLoop { i += 1 }(until(i == 3))
      i must equalTo(3)
    }
  }
}