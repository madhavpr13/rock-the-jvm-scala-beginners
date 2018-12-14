package exercises

object FunctionExercises extends App {

  def greet(name:String, age:Int) = s"Hi, my name is $name and I am $age years old"

  println(greet("Madhav", 28))

  def factorial(n:Long):Long = if( n <= 1) 1 else n * factorial(n-1)

  def fibonacci(n:Int): Int = if( n <= 2) 1 else  {
    fibonacci(n-1) + fibonacci(n-2)
  }

  println(fibonacci(15))

  def isPrime(n:Int):Boolean = {

    def isPrimeHelper(i:Int):Boolean = {
      if(i <= 1) true
      else n % i != 0 && isPrimeHelper(i-1)
    }

    isPrimeHelper(n/2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))

}
