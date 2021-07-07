package com.pedrorenzo.scalabeginners
package lectures.part2op

object Inheritance extends App {

  class Animal {
    def eat = println("Eating...")
    val creatureType = "Animal"
  }

  class Cat extends Animal

  val cat = new Cat
  cat.eat

  // Constructors:
  class Person(name: String, age: Int)

  // The code below will not work, because the JVM calss first the Person constructor,
  // which does not have the required arguments.
  // class Adult(name:String, age: Int, idCard: String) extends Person

  // The correct way is:
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // Or we could have a second constructor, like this:
  class Administrator(name: String, salary: Int) {
    def this(name: String) = this(name, 1000)
  }

  class AdministratorAdult(name: String, salary: Int, idCard: String) extends Administrator(name)

  // Overriding
    class Dog extends Animal {
    // We could override the field also like this:
    // class Dog(override val creatureType = "Dog") extends Animal {
    override val creatureType = "Dog"
    override def eat = println("Dog eating...")
  }

  val dog = new Dog
  dog.eat
  // We can also override fields:
  println(dog.creatureType)

  // Type substitution (polymorphism):
  val unknownAnimal: Animal = new Dog
  unknownAnimal.eat

  // Preventing overrides:
  // 1 - Use the keyword final on the method (final def eat: ...).
  // 2 - Use the keyword final on the class (final class Animal...).
  // 3 - Seal the class = Extend files in this file only, but prevent it on other files (sealed class Animal...).
}
