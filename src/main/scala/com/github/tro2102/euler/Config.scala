package com.github.tro2102.euler

/**
 * Created on 8/28/14.
 * @author Taylor Owens
 */
case class Config(problemNum: Int = 0) {}

object Config {
  private val Parser = new scopt.OptionParser[Config]("euler-scala") {
    head("Project Euler")

    opt[Int]('p', "problem-number")
      .text("The number of the euler problem to run")
      .required()
      .action( { (x, c) =>
        c.copy(problemNum = x)
      })
  }

  def parse(args: Array[String]) = {
    Parser.parse(args, Config())
  }
}
