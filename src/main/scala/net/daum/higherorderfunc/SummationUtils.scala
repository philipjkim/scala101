package net.daum.higherorderfunc

object SummationUtils {

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b)
}

object SummationUtilsRunner extends App {
  println("sumInts(1,10)=%d".format(SummationUtils.sumInts(1, 10)))
}