package net.daum.ch06

trait IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}