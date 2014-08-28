package com.github.tro2102.euler.runner

import com.github.tro2102.euler.DivisorCalculator

/**
 * Created on 8/28/14.
 * @author Taylor Owens
 */
trait ProblemRunner {

  sealed def run: Long = {
    val t0 = System.nanoTime()
    print(runImpl)
    val t1 = System.nanoTime()
    t1 - t0
  }

  def runImpl: String
}

object ProblemRunner {
  def apply(num: Int): ProblemRunner = {
    num match {
      case 1 => new Problem1()
      case _ => throw new NotImplementedError(s"No implementation for Problem #$num")
    }
  }
  private class Problem1 extends ProblemRunner {
    override def runImpl: String =
      DivisorCalculator.Range.sum(1 until 1000, 3, 5).toString
  }
}
