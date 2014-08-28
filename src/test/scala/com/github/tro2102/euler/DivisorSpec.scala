package com.github.tro2102.euler

import com.github.tro2102.BaseSpec

/**
 * Created on 8/28/14.
 * @author Taylor Owens
 */
class DivisorSpec extends BaseSpec{

  "The divisor calculator" should "find all numbers in a range which are divisible" in {
    DivisorCalculator.Range.find(1 until 5, 3) shouldBe Seq(3)
  }

  it should "find all numbers in a list which are divisible" in {
    DivisorCalculator.List.find(List(2, 3, 4), 3) shouldBe Seq(3)
  }

  it should "find the sum of divisible numbers in a range" in {
    DivisorCalculator.Range.sum(1 until 5, 3) shouldBe 3
    DivisorCalculator.Range.sum(1 until 10, 3) shouldBe 18
  }

  it should "find the sum of divisible numbers in a list" in {
    DivisorCalculator.List.sum(List(2, 3, 4), 3) shouldBe 3
    DivisorCalculator.List.sum(List(2, 3, 4, 6, 7, 9), 3) shouldBe 18
  }
}
