package com.github.tro2102.euler

import com.github.tro2102.euler.decorator.DivisibleInts

/**
 * Created on 8/28/14.
 * @author Taylor Owens
 */
object DivisorCalculator extends DivisibleInts {

  object Range {

    /**
     * Returns sum of all integers between range divisible by any of the passed-in divisors
     *
     * @param range
     * @param divisors
     * @return
     */
    def sum(range: Range, divisors: Int*): Int =
      find(range, divisors: _*).sum

    /**
     * Returns list of all integers between range which are divisible by any of the passed-in divisors
     *
     * @param range
     * @param divisors
     * @return
     */
    def find(range: Range, divisors: Int*): collection.Seq[Int] = {
      for (i <- range
           if i isDivisible(divisors: _*) ) yield i
    }
  }

  object List {
    /**
     * Returns sum of all integers in list divisible by any of the passed-in divisors
     *
     * @param list
     * @param divisors
     * @return
     */
    def sum(list: Seq[Int], divisors: Int*): Int =
      find(list, divisors: _*).sum

    /**
     * Returns list of all integers between range which are divisible by any of the passed-in divisors
     *
     * @param list
     * @param divisors
     * @return
     */
    def find(list: Seq[Int], divisors: Int*): collection.Seq[Int] = {
      for (i <- list
           if i isDivisible(divisors: _*) ) yield i
    }
  }
}
