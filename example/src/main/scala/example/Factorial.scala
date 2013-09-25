package example

import scala.annotation.tailrec

/**
 * Factorial algorithm
 * User: suresh
 * Date: 9/25/13
 */
object Factorial {

  /**
   * Normal factorial algorithm
   * @param x
   * @return
   */
  def factorial(x: Int): Int = if (x == 0) 1 else x * factorial(x - 1)

  /**
   * Tail recusive version of factorial
   * @param n
   * @return
   */
  def fact(n: Long): Long = {

    @tailrec
    def fact0(accm: Long, n: Long): Long = if (n == 0) accm else fact0(accm * n, n - 1)

    fact0(1, n)

  }

  def main(args: Array[String]) {
    println("Fact(40) = " + fact(20))
  }

}
