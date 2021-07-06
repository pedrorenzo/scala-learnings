package com.pedrorenzo.scalabeginners
package lectures.part1basics

object Functions extends App {

  // The compiler would understand that this would return a String. It's not required to use ": String" here, but
  // in some cases it could complain (in recursions, for example)!
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  // In Scala, when you need loops, use recursion!
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello", 3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }

  def aGreetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I'm " + age + " years old"
  }
  println(aGreetingFunction("Pedro", 28))

  def aFactorialFunction(n: Int): Int = {
    if (n <= 0) 1
    else n * aFactorialFunction(n-1)
  }
  println(aFactorialFunction(5))

  def aFibonacciFunction(n: Int): Int = {
    if (n <= 2) 1
    else aFibonacciFunction(n-1) + aFibonacciFunction(n-2)
  }
  println(aFibonacciFunction(8))

}
