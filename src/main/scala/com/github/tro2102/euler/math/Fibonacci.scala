package com.github.tro2102.euler.math

/**
 * Created on 8/28/14.
 * @author Taylor Owens
 */
object Fibonacci {

  def generateUpTo(initList: List[Int], maxValue: Int): List[Int] = {
    val nextValue = if (initList.size < 2) 1 else initList(0) + initList(1)
    if (nextValue > maxValue)
      initList
    else generateUpTo(initList.+:(nextValue), maxValue)
  }
}
