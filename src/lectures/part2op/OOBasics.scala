package com.pedrorenzo.scalabeginners
package lectures.part2op

object OOBasics extends App {
  val person = new Person("John", 26)
  println(person.age)
  person.greet("David")
  person.greet()
}

// Constructor:
// If we don't have the keyword "val", it would be a class parameters and not a field. Val makes it a field.
class Person(val name: String, val age: Int) {
  // This is also a field:
  val x = 2

  // This will be executed everytime that a class is instantiated, all the block will be executed!
  println("Person instantiated!")

  def greet(name: String): Unit = println(s"${this.name} says: Hi, ${name}!")

  // Overloading:
  def greet(): Unit = println(s"Hello, I am ${name}")

  // Overloading constructors:
  def this(name: String) = this(name, 0)
}