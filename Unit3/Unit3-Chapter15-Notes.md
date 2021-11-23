# Chapter 15

## Anonymous functions
- types
  - `sum(a: Int, b: Int): Int`
  - type is `(Int, Int) => Int`
  - takes two integers and returns an integer
- compiler infers return type from the implementation
- `val sum = { (a: Int, b: Int) => a + b }`
  - long form lambda
- `val sum: (Int, Int) => Int = { _ + _ }`
  - improved sum for calcuator
- 
