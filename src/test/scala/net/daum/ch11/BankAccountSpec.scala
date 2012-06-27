package net.daum.ch11
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification

@RunWith(classOf[JUnitRunner])
class BankAccountSpec extends Specification {

  "BankAccount" should {
    val ba = new BankAccount
    "have balance 0 when newly created" in {
      ba.getBalance must equalTo(0)
    }
    "increase balance after deposit when amount is a positive number" in {
      ba.deposit(100)
      ba.getBalance must equalTo(100)
    }
    "not increase balance after deposit when amount is a negative number" in {
      ba.deposit(-100)
      ba.getBalance must equalTo(100)
    }
    "decrease balance after withdrawal" in {
      ba.withdraw(50) must equalTo(50)
    }
    "raise error on withdrawal if balnace is not enough" in {
      ba.withdraw(100) must throwA[RuntimeException](message = "insufficient funds")
    }
    "raise error on withdrawal if amount is negative" in {
      ba.withdraw(-100) must throwA[RuntimeException](message = "insufficient funds")
    }
  }
}