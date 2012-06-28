package net.daum.ch14

object Db {
  val table = Map(1 -> (1, "John Mayer", -1),
    2 -> (2, "Robert Cray", 1),
    3 -> (3, "Eric Clapton", 1),
    4 -> (4, "Buddy Guy", 1),
    5 -> (5, "Marak Knopfler", 2))

  def team(id: Int) = {
    for (rec <- table.values.toList; if rec._3 == id)
      yield recToEmployee(rec)
  }

  def get(id: Int) = recToEmployee(table(id))

  private def recToEmployee(rec: (Int, String, Int)) = {
    println("[db] fetching " + rec._1)
    Employee(rec._1, rec._2, rec._3)
  }

  def main(args: Array[String]) {
    val employee = Db.get(2)
    val manager = employee.manager
    val team = employee.team
  }
}