package recfun

import common._
import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    @tailrec
    def balance0(acc: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty) acc == 0
      else {
        // This is an expression and the first if condition should follow an else.
        if (acc == -1) false
        else if (chars.head == '(')
          balance0(acc + 1, chars.tail)
        else if (chars.head == ')') {
          balance0(acc - 1, chars.tail)
        } else {
          balance0(acc, chars.tail)
        }
      }

    }

    balance0(0, chars)

  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    if(money <= 0 || coins.isEmpty) 0
     countChange(money,coins.tail) + countChange(money-coins.head, coins)
  }
}
