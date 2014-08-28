package com.github.tro2102.euler.decorator

/**
 * Created on 8/28/14.
 * @author Taylor Owens
 */
trait DivisibleInts {

  implicit def intToDivisibleInt(int: Int) = new DivisibleInt(int)

  case class DivisibleInt(i: Int) {
    /**
     * Given a list of divisors, returns whether this int is divisible by any of the divisors
     *
     * @param divisors
     * @return
     */
    def isDivisible (divisors: Int*): Boolean =
      divisors.foldLeft(false) { (b, j) =>
        b || i % j == 0
      }
  }

}
