package net.daum.ch07

abstract class Expr {
  def eval: Int
  def toStr: String
}

class Number(n: Int) extends Expr {
  def eval = n
  def toStr = n.toString
}

class Sum(e1: Expr, e2: Expr) extends Expr {
  def eval = e1.eval + e2.eval
  def toStr = "(%s + %s)".format(e1.toStr, e2.toStr)
}

class Prod(e1: Expr, e2: Expr) extends Expr {
  def eval = e1.eval * e2.eval
  def toStr = "(%s * %s)".format(e1.toStr, e2.toStr)
}
