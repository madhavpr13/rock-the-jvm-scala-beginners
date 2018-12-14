package lecture.part1_basics

object Expressions extends App{

  val x = 1 + 2
  println(x)
  println(x == 3)
  println(x != 3)

  println(!(3 == x && x < 5))

  var aVariable = 2
  aVariable += 3
  println(aVariable)


  // Statements (instructions) vs Expressions
  // instruction -> something you tell the computer to do
  // expression -> something that has a value and a type

  // IF EXPRESSION
  val aCondition = true // don't care about the actual value
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)

  // LOOPS (discouraged in functional programming)  -> NEVER WRITE IT AGAIN
  var i = 0
  while(i < 10) {
    println(i)
    i += 1
  }

  // Everything in Scala is an expression

  val aWeirdValue = (aVariable = 3) //Unit
  println(aWeirdValue)

  val aCodeblock  = {
    val y = 2
    val z = y + 2
    if (z > 2) "Hello"
    else "Goodbye"
  }

  println(aCodeblock)

}
