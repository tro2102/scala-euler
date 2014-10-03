package com.github.tro2102.euler.math

import com.github.tro2102.BaseSpec

/**
 * Created by tro2102 on 8/28/2014.
 */
class FactorCalculatorSpec extends BaseSpec{

  "Factor Calculator" should "find all factors of an int" in {
    FactorCalculator.findAll(10) should contain only (1, 2, 5, 10)
  }

  it should "find all factors of perfect square" in {
    FactorCalculator.findAll(25) should contain only (1, 5, 25)
  }

  it should "find all prime factors" in {
    FactorCalculator.findPrime(100) should contain only (2, 5)
    FactorCalculator.findPrimeCounts(100).get(2).get shouldEqual 2
    FactorCalculator.findPrimeCounts(100).get(5).get shouldEqual 2
  }

}
