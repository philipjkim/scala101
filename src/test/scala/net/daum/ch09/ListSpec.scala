package net.daum.ch09
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification

@RunWith(classOf[JUnitRunner])
class ListSpec extends Specification {

  "Empty List" should {
    "be empty" in {
      val empty = Nil
      empty.isEmpty must equalTo(true)
    }
  }
  "Non-empty List" should {
    val fruit = List("apples", "oranges", "pears")
    "be created by List constructor" in {
      fruit.isInstanceOf[List[String]] must equalTo(true)
    }
    "be created by ::" in {
      val fruit2 = "apples" :: "oranges" :: "pears" :: Nil
      fruit2.isInstanceOf[List[String]] must equalTo(true)
    }
    "not be empty" in {
      fruit.isEmpty must equalTo(false)
    }
    "return head and tail exactly" in {
      fruit.head must equalTo("apples")
      fruit.tail must equalTo(List("oranges", "pears"))
      fruit.tail.head must equalTo("oranges")
    }
  }
}