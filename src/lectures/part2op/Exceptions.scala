package com.pedrorenzo.scalabeginners
package lectures.part2op

object Exceptions extends App {

  // 1 - How to throw exception:
  // throw new NullPointerException


  // 2 - How to catch exception:
  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No Int for you!")
    else 42

    try {
      getInt(true)
    } catch {
      case e: RuntimeException => println("Caught a RuntimeException")
    } finally {
      println("Finally!")
    }

  // 3 - How to define your own exceptions:
  class MyException extends Exception
  val exception = new MyException
  // throw exception

}
