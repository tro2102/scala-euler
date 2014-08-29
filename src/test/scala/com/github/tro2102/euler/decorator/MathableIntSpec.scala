package com.github.tro2102.euler.decorator

import com.github.tro2102.BaseSpec
/**
 * Created on 8/28/14.
 * @author Taylor Owens
 */
class MathableIntSpec extends BaseSpec with MathableInts {
  "A Mathable Int" should "know if it's divisible by a single int" in {
    10.isDivisible(1) shouldBe true
    10.isDivisible(7) shouldBe false
  }

  it should "know if it's divisible by one of a list of ints" in {
    10.isDivisible(7, 2) shouldBe true
    10.isDivisible(7, 4) shouldBe false
  }

  it should "handle an empy list gracefully" in {
    10.isDivisible() shouldBe false
  }
}
