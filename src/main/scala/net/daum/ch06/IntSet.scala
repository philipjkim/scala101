package net.daum.ch06

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}