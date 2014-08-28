package com.github.tro2102.euler

/**
 * Created on 8/28/14.
 * @author Taylor Owens
 */
object Divisor {
  
  def sums(lowerBound: Int, upperBound: Int, divisors: Int*): Int =
    (for ( i <- lowerBound until upperBound
           if isDivisible(i, divisors: _*)) yield i).sum

  def isDivisible (i: Int, divisors: Int*) =
    divisors.foldLeft(false) { (b, j) =>
      b || i % j == 0
    }

}
