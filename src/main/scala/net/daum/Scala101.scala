package net.daum

object Scala101 extends App {
  val sorter = new Sorter()
  val array = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
  println(array.deep)
  sorter.quicksort(array)
  println(array.deep)
}
