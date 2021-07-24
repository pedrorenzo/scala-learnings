package com.pedrorenzo.scalabeginners
package lectures.part3fp

object AnonymousFunction extends App {

  // AnonymousFunction or Lambda:
  val doubler = (x: Int) => x * 2

  // Multiple parameters:
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  // No params:
  val justDoSomething = () => 3

  // For lambdas, we do need to add the "()" to the function call.
  println(justDoSomething())

  // Curly braces with lambdas:
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MOAR Syntactic Sugar
  val niceIncrementer: Int => Int = _ + 1 // Equivalent to x => x + 1.
  val niceAdder: (Int, Int) => Int = _ + _ // Equivalent to (a, b) => a + b.

}
