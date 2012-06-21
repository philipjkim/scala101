package net.daum.ch06

class EmptySet extends IntSet {
  def contains(x: Int) = false
  def incl(x: Int) = new NonEmptySet(x, new EmptySet, new EmptySet)
  override def toString = ""
}

class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int) =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  def incl(x: Int) =
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this
  override def toString = "%s %d %s".format(left.toString, elem, right.toString).trim
}

object IntSetRunner extends App {
  val emptySet = new EmptySet
  val left = emptySet incl 1
  val right = emptySet incl 3
  val set = new NonEmptySet(2, left, right)
  println(set)
}