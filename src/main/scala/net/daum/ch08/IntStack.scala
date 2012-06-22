package net.daum.ch08

abstract class IntStack {
  def push(x: Int): IntStack = new IntNonEmptyStack(x, this)
  def isEmpty: Boolean
  def top: Int
  def pop: IntStack
}
class IntEmptyStack extends IntStack {
  def isEmpty = true
  def top = sys.error("EmptyStack.top")
  def pop = sys.error("EmptyStack.pop")
}
class IntNonEmptyStack(elem: Int, rest: IntStack) extends IntStack {
  def isEmpty = false
  def top = elem
  def pop = rest
}

object IntStackRunner extends App {
  val s = new IntEmptyStack
  println(s.isEmpty)
  println(s.top)
}