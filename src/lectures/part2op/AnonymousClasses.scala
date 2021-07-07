package com.pedrorenzo.scalabeginners
package lectures.part2op

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  // Anonymous Class:
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("Hahahaha")
  }

  println(funnyAnimal.getClass)

}
