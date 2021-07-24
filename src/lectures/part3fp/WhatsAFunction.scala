package com.pedrorenzo.scalabeginners
package lectures.part3fp

object WhatsAFunction extends App {

  // Dream: Use functions as first class elements
  // Problem: OOP

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  // Function types = Function1[A, B]. We can substitute "MyFunction" by "Function1" (ready from the language).
  val stringToIntConverter = new Function[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverter("3") + 4)

  // ((Int, Int) => Int) Is the syntactic sugar, where "=> Int" means that it returns Int.
  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }

  // All Scala functions are objects!

}

trait MyFunction[A, B] {
  def apply(element: A): B
}
