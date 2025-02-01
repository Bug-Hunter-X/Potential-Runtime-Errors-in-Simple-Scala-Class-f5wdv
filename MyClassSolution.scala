```scala
import scala.util.{Try, Success, Failure}

class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
  
  def myMethodSafe(y: Int):Try[Int] = {
    Try(x + y)
  }
}

val obj = new MyClass(5)
println(obj.myMethod(10)) // Output: 15

val result = obj.myMethodSafe(10) // Try[Int] result
result match {
  case Success(value) => println(s"Success: $value") //Output: Success: 15
  case Failure(exception) => println(s"Failure: ${exception.getMessage}")
}

//Example of failure
val obj2 = new MyClass(5)
val failResult = obj2.myMethodSafe(null.asInstanceOf[Int])
failResult match {
  case Success(value) => println(s"Success: $value")
  case Failure(exception) => println(s"Failure: ${exception.getMessage}") //Output: Failure: java.lang.NullPointerException
}
```