package com.pedrorenzo.scalabeginners
package lectures.part2op

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  // Case keyword makes:
  // 1 - Class parameters are fields.
  val jim = new Person("Jim", 34)
  // If I remove "case" from the Person class, this would not be possible:
  println(jim.name)

  // 2 - Sensible toString.
  // If I remove "case" from the Person class, this would print a hash:
  println(jim.toString)

  // 3 - Equals and HashCode implemented.
  val jim2 = new Person("Jim", 34)
  // If I remove "case" from the Person class, this would print false, because it's a different instance:
  println(jim == jim2)

  // 4 - Handy copy methods.
  // For example, like this, will copy "jim", changing its age.
  val jim3 = jim.copy(age = 45)
  println(jim3)

  // 5 - Companion objects.
  val thePerson = Person
  val mary = Person("Mary", 29)

  // 6 - Are serializable.

  // 7 - Extractor patterns = Can be used in pattern matching.

}
