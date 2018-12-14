package lecture.part1_basics

object Functions extends App{

  def aFunction(a:String, b:Int):String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  // Functions with no parameters can be called with just their name

  def aParameterlessFunction():Int = 42
  println(aParameterlessFunction()) // usual way
  println(aParameterlessFunction)


  // String repetition ("string" * n) using recursion

  def aRepeatedFunction(string: String, n:Int):String = {
    if(n == 1) string
    else string + aRepeatedFunction(string, n-1)
  }

  println(aRepeatedFunction("Hello",3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  // Return types of non recursive functions can be removed (because of type inference)

  // Methods that do not return "anything" result in () [Unit] by default

  def aFunctionWithSideEffects(str:String):Unit = println(str) // side effects

  // Code blocks also allow us to define auxillary functions


  def aBigFunction(n:Int):Int = {

    def aSmallFunction(a:Int, b:Int):Int  =  {
      a + b
    }

    // can use functions defined inside the code block to infer the return type of the outer function
    aSmallFunction(n, n-1)
  }

  println(aBigFunction(5))


}

