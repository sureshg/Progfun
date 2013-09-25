package example

import scala.annotation.tailrec

/**
 * Algorithm to find the Greatest common divisor of two numbers using Euclid's algorithm
 * User: suresh
 * Date: 9/25/13
 */
object GCD {

  /**
   * Euclid's algorithm to find GCD
   *
   * @param a
   * @param b
   * @return
   */
  @tailrec
  def gcd(a: Int, b:Int) :Int = if(b==0)a else gcd (b, a%b)

  def main (args: Array[String]) {

    println("GCD (14,21) = " + gcd(14,21))
  }

}
