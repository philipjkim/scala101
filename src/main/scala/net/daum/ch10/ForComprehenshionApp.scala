package net.daum.ch10
import net.daum.ch09.PrimeUtils

object ForComprehenshionApp extends App {

  def getPrimePairs(maxNum: Int) = {
    for {
      i <- List.range(1, maxNum)
      j <- List.range(1, i)
      if PrimeUtils.isPrime(i + j)
    } yield (i, j)
  }
  println(getPrimePairs(7))

  def queens(n: Int): List[List[Int]] = {
    def isSafe(col: Int, queens: List[Int], delta: Int): Boolean = {
      queens match {
        case Nil => true
        case List() => true
        case c :: rest =>
          c != col && math.abs(c - col) != delta && isSafe(col, rest, delta + 1)
      }
    }
    def placeQueens(k: Int): List[List[Int]] =
      if (k == 0) List(List())
      else for {
        queens <- placeQueens(k - 1)
        column <- List.range(1, n + 1)
        if isSafe(column, queens, 1)
      } yield column :: queens
    placeQueens(n)
  }
  println(queens(8))

  case class Book(title: String, authors: List[String])
  val books: List[Book] = List(
    Book("Programming in Scala", List("Martin Odersky", "Lex Spoon", "Bill Venners")),
    Book("Scala for the Impatient", List("Cay Horstmann")),
    Book("Scala in Depth", List("Joshua D. Suereth")),
    Book("Programming Scala", List("Alex Payne", "Dean Wampler")))
  println(for (b <- books; a <- b.authors if a startsWith "Martin") yield b.title)
  println(for (b <- books if (b.title indexOf "Program") >= 0) yield b.title)
}