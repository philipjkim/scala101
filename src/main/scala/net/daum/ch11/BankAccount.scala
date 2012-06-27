package net.daum.ch11

class BankAccount {
  private var balance = 0
  def deposit(amount: Int) {
    if (amount > 0) balance += amount
  }
  def withdraw(amount: Int): Int = {
    if (amount > 0 && balance >= amount) {
      balance -= amount
      balance
    } else error("insufficient funds")
  }
  def getBalance = balance
}