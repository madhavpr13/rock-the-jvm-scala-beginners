package exercises

import scala.annotation.tailrec

object StackAndTailRecursionExercises extends App{

  def repeatStringNTimes(n:Int, string:String):String = {
    @tailrec
    def repHelper(i:Int, acc:String):String = {
      if(i == 1) acc
      else repHelper(i-1, acc + string)
    }

    repHelper(n, string)
  }

  println(repeatStringNTimes(5, "Hello"))


  def isPrimeTailRec(n:Int):Boolean = {

    @tailrec
    def isPrimeHelper(t:Int, isStillPrime:Boolean):Boolean = {
      if(! isStillPrime) false
      else if(t <= 1) true
      else isPrimeHelper(t-1, isStillPrime && n % t != 0)
    }

    isPrimeHelper(n/2, true)
  }

  println(isPrimeTailRec(73))


  def fibonacci(n:Int):BigInt = {

    @tailrec
    def fibonacciHelper(i:Int, a:BigInt, b:BigInt):BigInt = {
      if( i <= 2) b
      else fibonacciHelper(i-1, b, a+b)
    }

    fibonacciHelper(n, 1, 1)
  }

  println(fibonacci(8))
}
