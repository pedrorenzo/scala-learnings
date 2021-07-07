package com.pedrorenzo.scalabeginners
package lectures.part2op

object Generics extends App {

  class MyList[A]
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  class MyMap[A, Value]

  // Generic Methods:
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  // Variance Problem:
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // If Cat extends Animal, does a list of Cats also extends a list of Animals?
  // 1. Yes, List[Cat] extends List[Animal] -> Covariance (+ before A defines this!).
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // 2. No, they are different things -> Invariance.
  class InvariantList[A]
  // val invariantList: InvariantList[Animal] = new InvariantList[Cat] -> This would give us an error.

  // 3. Hell, no! -> Contravariance (-before A defines this!).
  // Let's think like: A trainer can train Animals, so he can train also Cats!
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // Bounded Types:
  // <: means that Cage just accepts types that are subtypes of class Animal.
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class car
  // val car = new Cage(new Car) -> This would not work, as Car is not a subtype of Animal.

}
