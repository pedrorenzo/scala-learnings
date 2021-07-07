package com.pedrorenzo.scalabeginners
package lectures.part2op

object Objects extends App {

  // Scala does not have class level functionality ("static" does not exist). Object does kind of the same thing.
  // What in Java would be: private static final int N_EYES = 2. In Scala is:
  object Person { // Defines type + its only instance.
    val N_EYES = 2
    // We can have methods in objects, but an object can not receive parameters.
    def canFly: Boolean = false

    // Factory method:
    def apply(mother: Person, father: Person): Person = new Person("Bob")
  }

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object is a Singleton Instance
  val mary = Person
  val john = Person

  // Will be the same value, as Mary and John point to the same instance of Person.
  println(mary.N_EYES)
  println(john.N_EYES)
  println(john == mary)

  // Having the class Person and the object Person in the same class is called Companions!
  // Companions = Same scope and same name.
  class Person(val name: String) {
    // Instance level functionality
  }

  // Scala object is a Singleton Instance
  val edward = new Person("Edward")
  val maria = new Person("Maria")

  println(edward == maria)

  val bob = Person(maria ,edward )
  println(bob.name)

  // Scala Applications = Scala Object with a very important method:
  // main(args: Array[String]): Unit
  // Or...to simplify, we can "extends App", that already has a main method.

}
