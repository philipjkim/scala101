package net.daum.ch15

abstract class SemiGroup[A] {
  def add(x: A, y: A): A
}