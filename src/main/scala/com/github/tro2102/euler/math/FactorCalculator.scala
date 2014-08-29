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
  def findAll(n: Int) : Seq[Int] = {
    val sqrt = Math.sqrt(n)
    (
      if (n % sqrt == 0)
        Seq((n/sqrt).toInt)
      else
        Seq[Int]()
      ) ++: (for (i <- 1 until Math.sqrt(n).toInt
                  if n %
                    i == 0) yield List(i, n / i))
      .flatten
  }

  /**
   * For a given integer, find all integer divisors, unordered
   * @param n
   * @return
   */
  def findPrime(n: Int) : Seq[Int] = {
    findAll(n).filter( x => x.isPrime )
  }
}
