package net.daum.ch07

abstract class Expr {
  def eval: Int
}

class Number(n: Int) extends Expr {
  def eval = n
}

class Sum(e1: Expr, e2: Expr) extends Expr {
  def eval = e1.eval + e2.eval
}

class Prod(e1: Expr, e2: Expr) extends Expr {
  def eval = e1.eval * e2.eval
}