package net.daum.ch14

case class Employee(id: Int, name: String, managerId: Int) {
  lazy val manager: Employee = Db.get(managerId)
  lazy val team: List[Employee] = Db.team(id)
}