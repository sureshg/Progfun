package week1

import scala.annotation.tailrec

/**
 * Methods to find sum and max.
 *
 * User: suresh
 * Date: 10/1/13
 * Time: 12:55 AM
 */
object Max {

  @tailrec
  def sum0(acc: Int, x: List[Int]): Int = {
    if (x.isEmpty) acc
    else
      sum0(acc + x.head, x.tail)
  }

  def sum(x: List[Int]) = sum0(0, x)


  @tailrec
  def max0(max: Int, x: List[Int]): Int = {
    if (x.isEmpty) max
    else {
      val nmax = if (max < x.head) x.head else max
      max0(nmax, x.tail)
    }
  }

  def max(x: List[Int]) = max0(0, x)

  def main(args: Array[String]) {
    println("Sum (List(10,15,20)) " + sum(List(10, 15, 20)))
    println("Max (List(10,15,20)) " + max(List(10, 15, 20)))
  }

}
