package com.pedrorenzo.scalabeginners
package lectures.part1basics

object ValuesVariablesTypes extends App {

  // I can't do x = 45, because vals are immutable.
  // val x = 42 is the same thing that we did below. Types are optional.
  val x: Int = 42

  println(x)

  val aString: String = "Hello"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aShort: Short = 4613
  val aLong: Long = 165156165156L
  val aFloat: Float = 2.0f
  val aDouble: Double = 2.0

  // Variables:
  var aVariable: Int = 4
  // Vars are not immutable.
  aVariable = 5
}
