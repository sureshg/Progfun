package week1

/**
 * Find the Square root of a number using Newton's method
 * User: suresh
 * Date: 9/24/13
 * Time: 12:31 AM
 */
object SquareRoot {

  /**
   * Find the absolute value of a number.
   *
   * @param x
   * @return
   */
  def abs(x: Double) = if (x < 0) -x else x

  /**
   * Find square root of a number
   *
   * @param x
   * @return
   */
  def sqrt(x: Double) = {
    /**
     * Check if the guess is close enough to the square root
     *
     * @param guess
     * @return
     */
    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    /**
     * Improve the guess if it's not isGoodEnough.
     * The Newton's method logic is implemented here.
     *
     * @param guess
     * @return
     */
    def improve(guess: Double) =
      (guess + x / guess) / 2

    /**
     * Square root iterator
     *
     * @param guess
     * @return
     */
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess))
        guess
      else
        sqrtIter(improve(guess))

    /**
     * Call the sqrt iterator.
     */
    sqrtIter(1)
  }

  /**
   * Main method
   *
   * @param args
   */
  def main(args: Array[String]) {
    println(sqrt(2))
    println(sqrt(10))
    println(1e-5 + " : " + sqrt(1e-5))
    println(1e50 + " : " + sqrt(1e50))
  }


}