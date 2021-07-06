package com.pedrorenzo.scalabeginners
package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  // Each call of the recursive function uses a stack frame.
  // With this factorial function, if we call it with a big number (e.g. 5000) we'll have a stack overflow exception.
  def factorial(n:  Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)
      result
    }
  }
  println(factorial(10))
  // println(factorial(5000)) -> This will cause stack overflow exception.

  // A smart implementation to not have stack overflow exception:
  // This works well because factorialHelper is the last expression on this code path, what allows Scala to preserve
  // the same stack frame for the recursive calls, it doesn't save intermediate results. This is called Tail Recursion.
  // When you need loops, use tail recursion!
  def factorialSmartWay(n: Int): BigInt = {
    @tailrec // This annotation says to compiler that it is supposed to be a Tail Recursion. If it's not, compiler
             // would thrown an error.
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)

    factorialHelper(n, 1)
    /*
      factorialSmartWay(10) = factorialHelper(10, 1)
      = factorialHelper(9, 10 * 1)
      = factorialHelper(8, 9 * 10 * 1)
      = factorialHelper(7, 8 * 9 * 10 * 1)
      = ...
      = factorialHelper(2, 3 * 4 * ... * 10 * 1)
      = factorialHelper(1, 2 * 3 * 4 * ... * 10 * 1)
      = 1 * 2 * 3 * 4 * ... * 10
     */
  }
  println(factorialSmartWay(10))
  println(factorialSmartWay(700))
  
}
