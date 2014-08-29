package com.github.tro2102.euler.decorator

/**
 * Created on 8/28/14.
 * @author Taylor Owens
 */
trait MathableInts {

  implicit def intToMathableInt(int: Int) = new MathableInt(int.toLong)
  implicit def longToMathableInt(int: Long) = new MathableInt(int)

  case class MathableInt(n: Long) {
    /**
     * Given a list of divisors, returns whether this int is divisible by any of the divisors
     *
     * @param divisors
     * @return
     */
    def isDivisible (divisors: Int*): Boolean =
      divisors.foldLeft(false) { (b, j) =>
        b || n % j == 0
      }

    def isPrime: Boolean = {
      if (n == 2 || n == 3)
        return true
      if (n % 2 == 0 || n % 3 == 0)
        return false
      
      var i = 5
      var y = 2
      while (i * i <= n) {
        if (n % i == 0)
          return false

        i += y
        y = 6 - y
      }
      true
    }
  }

}
