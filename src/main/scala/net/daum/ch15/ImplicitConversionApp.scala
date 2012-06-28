package net.daum.ch15
import scala.math.Ordered

object ImplicitConversionApp extends App {
  implicit def int2str(y: Int): String = y.toString
  println(123 length)
}