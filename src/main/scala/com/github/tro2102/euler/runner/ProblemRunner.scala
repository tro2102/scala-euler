package com.github.tro2102.euler.runner

import com.github.tro2102.euler.decorator.MathableInts
import com.github.tro2102.euler.math.{FactorCalculator, Fibonacci, DivisorCalculator}

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
      case 3 => new Problem3
      case 4 => new Problem4
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
  private class Problem3 extends ProblemRunner {
    override def runImpl: String =
      FactorCalculator.findPrime(600851475143l).max.toString
  }
  private class Problem4 extends ProblemRunner with MathableInts {
    override def runImpl: String = {
      (for( i <- 100 to 999;
           j <- 100 to 999 if (i * j).isPalindromic) yield i * j).max.toString
    }
  }
}
