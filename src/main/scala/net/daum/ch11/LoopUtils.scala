package net.daum.ch11

object LoopUtils {
  def whileLoop(condition: => Boolean)(command: => Unit) {
    if (condition) {
      command; whileLoop(condition)(command)
    } else ()
  }
  def repeatLoop(command: => Unit)(condition: => Boolean) {
    if (condition) {
      command; repeatLoop(command)(condition)
    } else ()
  }
  def until(condition: => Boolean) = !condition
}