package net.daum.ch07

abstract class Expr {
  def isNumber: Boolean
  def isSum: Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr
  def eval(e: Expr): Int = {
    if (e.isNumber) e.numValue
    else if (e.isSum) eval(e.leftOp) + eval(e.rightOp)
    else error("unrecognized expression kind")
  }
}

class Number(n: Int) extends Expr {
  def isNumber = true
  def isSum = false
  def numValue = n
  def leftOp = error("Number.leftOp")
  def rightOp = error("Number.rightOp")
}

class Sum(e1: Expr, e2: Expr) extends Expr {
  def isNumber = false
  def isSum = true
  def numValue = error("Sum.numValue")
  def leftOp = e1
  def rightOp = e2
}

