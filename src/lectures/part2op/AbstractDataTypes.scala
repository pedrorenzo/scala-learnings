package com.pedrorenzo.scalabeginners
package lectures.part2op

object AbstractDataTypes extends App {

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Dog"
    override def eat: Unit = println("Dog eating...")
  }

  // Traits (like interface in Java):
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded

  // Traits allow us to "use" more than 1 class:
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Crocodile"
    override def eat: Unit = println("Crocodile eating...")
    override def eat(animal: Animal): Unit = println(s"I'm a crocodile eating a ${animal.creatureType} ...")
  }

  val dog = new Dog
  val crocodile = new Crocodile
  crocodile.eat(dog)

  // Traits vs Abstract classes:
  // Abstract classes and traits CAN have both implemented and non implemented methods.
  // Traits cannot have constructor parameters.
  // You can inherit multiple traits but you can extend just one class.
  // Conceptual: Traits are behaviors!

}
