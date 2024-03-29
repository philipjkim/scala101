package net.daum.ch02

object Sorter {

  def imperativeQuicksort(xs: Array[Int]) {
    def swap(i: Int, j: Int) {
      val t = xs(i); xs(i) = xs(j); xs(j) = t
    }
    def sort1(l: Int, r: Int) {
      val pivot = xs((l + r) / 2)
      var i = l;
      var j = r
      while (i <= j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j -= 1
        if (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if (l < j) sort1(l, j)
      if (j < r) sort1(i, r)
    }
    sort1(0, xs.length - 1)
  }

  def functionalQuicksort(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        functionalQuicksort(xs filter (pivot >)),
        xs filter (pivot ==),
        functionalQuicksort(xs filter (pivot <)))
    }
  }
}

object SorterRunner extends App {
  val array = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)

  println("Before functionalQuicksort:     %s".format(array.deep))
  val sorted = Sorter.functionalQuicksort(array)
  println("After functionalQuicksort:      %s".format(array.deep))
  println("Return of functionalQuicksort:  %s".format(sorted.deep))

  println("Before imperativeQuicksort:     %s".format(array.deep))
  Sorter.imperativeQuicksort(array)
  println("After imperativeQuicksort:      %s".format(array.deep))
}
