package com.pedrorenzo.scalabeginners
package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase)
  println(str.toUpperCase)
  println(str.length)

  val aNumberString: String = "45"
  val aNumber = aNumberString.toInt

  // +: and :+ are to append Strings.
  println('a' +: aNumberString :+ 'z')

  println(str.reverse)
  println(str.take(2))

  // -==Scala String Interpolators==-

  // S-Interpolator:
  val name = "David"
  val age = 12
  // This just work with the "s" on the beginning, otherwise would be a normal String.
  val greeting = s"Hello, my name is $name and I am $age years old."
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."
  println(greeting)
  println(anotherGreeting)

  // F-Interpolator:
  val speed = 1.2f
  // It will format the String, having name as a String (%s) and speed with 2 chars total and 2 decimal houses (%2.2f).
  val myth = f"$name%s can eat $speed%2.2f burger per minute"
  println(myth)

  // Raw-Interpolator:
  // It prints the String literally. \n will not break the line and will be printed.
  println(raw"This is a \n newline")

}
