package com.pedrorenzo.scalabeginners
package lectures.part1basics

object CallByValueVsCallByName extends App {

  def calledByValue(x: Long): Unit = {
    println("By value: " + x)
    println("By value: " + x)
  }

  // => tells the compiler that the parameter will be called by name. Not a value...an expression!
  def calledByName(x: => Long): Unit = {
    println("By name: " + x)
    println("By name: " + x)
  }

  // Here, we evaluate the expression and then send it to calledByValue(), that's why we print twice the same value.
  calledByValue(System.nanoTime())

  // Here, the expression is evaluated everytime, that's why we print different values.
  calledByName(System.nanoTime())
}
