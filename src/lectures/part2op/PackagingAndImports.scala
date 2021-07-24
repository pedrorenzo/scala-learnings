package com.pedrorenzo.scalabeginners
package lectures.part2op

object PackagingAndImports extends App {

  // This is on package.scala class:
  sayHello

  // If we want to import 2 classes from same package, it will be like this:
  // import xpto.{FirstClass, SecondClass}
  // Or, we can do like this, to import all:
  // import xpto._
  // We can use aliases to the imports
  // import xpto.{FirstClass, SecondClass => SC}. Then, we can use on our code SC instead of SecondClass.

}
