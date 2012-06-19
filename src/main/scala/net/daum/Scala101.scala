package net.daum

object Scala101 extends App {
  val sorter = new Sorter()
  val array = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)

  println("Before functionalQuicksort:     %s".format(array.deep))
  val sorted = sorter.functionalQuicksort(array)
  println("After functionalQuicksort:      %s".format(array.deep))
  println("Return of functionalQuicksort:  %s".format(sorted.deep))

  println("Before imperativeQuicksort:     %s".format(array.deep))
  sorter.imperativeQuicksort(array)
  println("After imperativeQuicksort:      %s".format(array.deep))
}
