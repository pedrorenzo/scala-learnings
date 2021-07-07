package com.pedrorenzo.scalabeginners
package lectures.part2op

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"${name} unary!!!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is ${name} and I like ${favoriteMovie}!!!"
  }

  val mary = new Person("Mary", "Inception")

  println(mary.likes("Inception"))

  // Equivalent to the above call (Infix notation or Operator notation). It just works with methods with 1 parameter.
  println(mary likes "Inception")

  // "Operators" in Scala:
  // We can have a method called "+" or "$" and so on...!!!
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  //This prints 3:
  println(1 + 2)

  //This also prints 3. This happens because operators in Scala are methods!!!
  println(1.+(2))

  // Prefix notation:
  val x = -1 // This is equivalent to the one below.
  val i = 1.unary_- // Unary prefix only works with - + ~ !

  // They print the same thing, because "!" is the same as "unary_!"...a method!!!
  println(!mary)
  println(mary.unary_!)

  // Postfix notation:
  println(mary.isAlive)
  println(mary isAlive)

  // Apply:
  println(mary.apply()) // This is equivalent to the one below.
  // If you call the class like this, the compiler will, everytime, call the apply method automatically!!!
  println(mary())

}
