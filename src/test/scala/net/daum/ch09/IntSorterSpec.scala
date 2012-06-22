package net.daum.ch09
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification

@RunWith(classOf[JUnitRunner])
class IntSorterSpec extends Specification {

  "IntSorter.isort" should {
    "return a sorted list from an unsorted list" in {
      val unsorted = List(5, 3, 4, 1, 2)
      IntSorter.isort(unsorted) must equalTo(List(1, 2, 3, 4, 5))
    }
  }
}