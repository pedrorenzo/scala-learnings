package com.pedrorenzo.scalabeginners
package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  // For this function (the same we wrote on Recursions file), we will always send acc as 1 when calling it.
  // We can set default args!
  @tailrec
  def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFact(n - 1, n * acc)
  }

  println(trFact(10))

  // I can also send the parameter anyways:
  println(trFact(10, 2))


  // There is a problem when you have multiple parameters with default values. Basically, the compiler can
  // get lost with the parameters. To solve this, we have to pass in every leading argument or name the arguments:
  println(trFact(5, acc = 2))

  // using arguments with names, we can even change the order of them:
  println(trFact(acc = 2, n = 5))
}