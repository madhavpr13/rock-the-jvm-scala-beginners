package lecture.part1_basics
import scala.annotation.tailrec

object StackAndTailRecursion extends App{

  def factorialTailRecursive(n:Int):BigInt = {
    @tailrec
    def factHelper(i:Int, product:BigInt): BigInt = {

      if(i <= 1) product
      else factHelper(i-1, product * i)
    }

    factHelper(n, 1)
  }

  println(factorialTailRecursive(5000))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION


}


