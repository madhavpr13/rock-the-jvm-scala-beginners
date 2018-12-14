package lecture.part1_basics

object ValsAndVars extends App{

  val x:Int = 42
  println(x)

 // Vals are immutable -> can't be reassigned

  //Type inference --> types of vals are optional
  val z = 73
  println(z)

  val aString:String = "Hello"
  val aBoolean:Boolean = false
  val aChar:Char = 'a'
  val aShort:Short = 453
  val aLong:Long = 32987492374938L
  val aFloat:Float = 4.5f
  val aDouble:Double = 24234.32

  // Variables
  var aVariable:Int = 4

  // variables can be reassigned
  aVariable = 5 // side effects
  


}
