package com.github.tro2102.euler.math

import com.github.tro2102.euler.decorator.MathableInts

/**
 * Created by tro2102 on 8/28/2014.
 */
object FactorCalculator extends MathableInts {

  /**
   * For a given integer, find all integer divisors, unordered
   * @param n
   * @return
   */
  def findAll(n: Long) : Seq[Long] = {
    val sqrt = Math.sqrt(n)
    (
      if (n % sqrt == 0)
        Seq((n/sqrt).toLong)
      else
        Seq[Long]()
      ) ++: (for (i <- 1l until Math.sqrt(n).toLong
                  if n %
                    i == 0) yield List(i, n / i))
      .flatten
  }

  /**
   * For a given integer, find all integer divisors, unordered
   * @param n
   * @return
   */
  def findPrime(n: Long) : Seq[Long] = {
    findAll(n).filter( x => x.isPrime )
  }
}
