package com.pedrorenzo.scalabeginners
package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // = 1 + 2 is an Expression in Scala.
  println(x)

  println(2 + 3 * 4)

  println(1 == x) // != > < >= <=

  println(!(1 == x)) // ! && ||

  var aVariable = 2
  aVariable += 3 // Also works with -= *= /=
  println(aVariable)

  // Instructions (DO something, Java use this!) vs Expressions (give me the VALUE of something):
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // If expression and not condition, because it returns a value.
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)

  // Scala is not Java, it is not a imperative language, so loops are not so recommended to use.
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // Reassigning a variable is side effect, basically, side effects in Scala is Expressions returning Unit
  // Side effects: println(), whiles, reassigning
  val aWeirdValue = (aVariable = 3) // The type of aWeirdValue is Unit === void (Java)
  println(aWeirdValue)

  // Code blocks:
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "Goodbye"
  }
  println(aCodeBlock)

}
