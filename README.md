# Potential Runtime Errors in Simple Scala Class

This repository demonstrates a simple Scala class and method.  While the code itself is straightforward, it highlights how seemingly innocuous Scala code can lead to runtime errors depending on the surrounding context.  Specifically, the issues that are not apparent here will only surface when `x` or `y` are not properly typed or can take a null value, or other values not implicitly convertable to an `Int`.

## Bug

The `MyClass` class contains a method `myMethod` that performs a simple addition of two integers.   If these integers are not appropriately handled there may be a runtime error.  The issue may surface during testing.