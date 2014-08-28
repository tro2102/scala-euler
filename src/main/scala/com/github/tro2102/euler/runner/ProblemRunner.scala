package com.github.tro2102.euler.runner

import com.github.tro2102.euler.math.{Fibonacci, DivisorCalculator}

/**
 * Created on 8/28/14.
 * @author Taylor Owens
 */
trait ProblemRunner {

  final def run: (Double, String) = {
    val t0 = System.nanoTime()
    val results = runImpl
    val t1 = System.nanoTime()
    ((t1 - t0) / 1000000d, results)
  }

  def runImpl: String
}

object ProblemRunner {
  def apply(num: Int): ProblemRunner = {
    num match {
      case 1 => new Problem1
      case 2 => new Problem2
      case _ => throw new NotImplementedError(s"No implementation for Problem #$num")
    }
  }
  private class Problem1 extends ProblemRunner {
    override def runImpl: String =
      DivisorCalculator.Range.sum(1 until 1000, 3, 5).toString
  }
  private class Problem2 extends ProblemRunner {
    override def runImpl: String =
      DivisorCalculator.List.sum(Fibonacci.generateUpTo(List(2,1), 4000000), 2).toString
  }
}
