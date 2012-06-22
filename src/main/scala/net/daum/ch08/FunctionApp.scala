package net.daum.ch08

object FunctionApp extends App {
  val f: (AnyRef => Int) = x => x.hashCode
  val g: (String => Int) = f
  println("\"abc\".hashcode=%d, g(\"abc\")=%d".format("abc".hashCode, g("abc")))

  val plus1: (Int => Int) = (x: Int) => x + 1
  println("plus1(2)=%d" format plus1(2))

  val plus2: Function1[Int, Int] = new Function1[Int, Int] {
    def apply(x: Int): Int = x + 1
  }
  println("plus2.apply(2)=%d" format plus2.apply(2))

  val plus3: Function1[Int, Int] = {
    class Local extends Function1[Int, Int] {
      def apply(x: Int): Int = x + 1
    }
    new Local: Function1[Int, Int]
  }
  println("plus3.apply(2)=%d" format plus3.apply(2))
}