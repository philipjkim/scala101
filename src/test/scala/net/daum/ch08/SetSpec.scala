package net.daum.ch08
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification

@RunWith(classOf[JUnitRunner])
class SetSpec extends Specification {

  "EmptySet[Num]" should {
    val s = new EmptySet[Num]
    "not contain Num(1)" in {
      s.contains(Num(1)) must equalTo(false)
    }
    "return an empty string as toString" in {
      s.toString must equalTo("")
    }
    "return a NonEmptySet when incl called" in {
      val s2 = s.incl(Num(1))
      s2.contains(Num(1)) must equalTo(true)
      s2.toString must equalTo("1.0")
    }
  }

  "NonEmptySet[Num] with Num[1], Num[5], Num[3]" should {
    val s = new EmptySet[Num].incl(Num(1)).incl(Num(5)).incl(Num(3))
    "contain Num(1)" in {
      s.contains(Num(1)) must equalTo(true)
    }
    "return '1.0 3.0 5.0' as toString" in {
      s.toString must equalTo("1.0 3.0 5.0")
    }
    "return '1.0 2.0 3.0 5.0' as toString after including 2" in {
      val s2 = s.incl(Num(2))
      s2.contains(Num(2)) must equalTo(true)
      s2.toString must equalTo("1.0 2.0 3.0 5.0")
    }
  }
}