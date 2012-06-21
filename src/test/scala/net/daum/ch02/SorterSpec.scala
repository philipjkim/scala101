package net.daum.ch02
import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SorterSpec extends Specification {

  "imperativeQuicksort" should {
    "sort the input array" in {
      var input = Array(5, 4, 3, 2, 1)
      Sorter.imperativeQuicksort(input)
      input must equalTo(Array(1, 2, 3, 4, 5))
    }
  }

  "functionalQuicksort" should {
    var input = Array(5, 4, 3, 2, 1)
    val newInput = Sorter.functionalQuicksort(input)
    "not modify the input array" in {
      input must equalTo(Array(5, 4, 3, 2, 1))
    }
    "return a new sorted array" in {
      newInput must equalTo(Array(1, 2, 3, 4, 5))
    }
  }
}