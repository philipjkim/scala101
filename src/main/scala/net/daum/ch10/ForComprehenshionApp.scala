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
  val title1 = for (b <- books; a <- b.authors if a startsWith "Martin") yield b.title
  val title1a = books.filter(b => b.authors.filter(_ startsWith "Martin").length > 0).map(b => b.title)
  assert(title1 == title1a)
  val title2 = for (b <- books if (b.title indexOf "Program") >= 0) yield b.title
  val title2a = books.map(b => b.title).filter(_ contains "Program")
  assert(title2 == title2a)
}