package net.daum.ch09
import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

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
  "map with square function" should {
    "return a mapped list with squared values" in {
      val list = List(1, 2, 3, 4, 5)
      val mapped = list map (x => x * x)
      mapped must equalTo(List(1, 4, 9, 16, 25))
    }
  }
  "filter with a even-number-finding fuction" should {
    "return a list with only even numbers" in {
      val list = List(1, 2, 3, 4, 5)
      val filtered = list filter (x => x % 2 == 0)
      filtered must equalTo(List(2, 4))
    }
  }
  "summing up all list elements" should {
    val list = List(1, 2, 3, 4, 5)
    "be done using reduceLeft" in {
      val total = (0 :: list) reduceLeft { (x, y) => x + y }
      total must equalTo(15)
    }
    "be done using foldLeft" in {
      val total = (list foldLeft 0) { (x, y) => x + y }
      total must equalTo(15)
    }
  }
  "multiplying all list elements" should {
    val list = List(1, 2, 3, 4, 5)
    "be done using reduceLeft" in {
      val total = (1 :: list) reduceLeft { (x, y) => x * y }
      total must equalTo(120)
    }
    "be done using foldLeft" in {
      val total = (list foldLeft 1) { (x, y) => x * y }
      total must equalTo(120)
    }
  }
}