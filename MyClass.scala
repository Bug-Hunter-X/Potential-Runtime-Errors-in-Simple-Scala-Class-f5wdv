```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

val obj = new MyClass(5)
obj.myMethod(10) //expect 15
```