# Chapter 16

## Partial functions
- functions defined for only some input
  - only some instances of a type
- `PartialFunctoin[A, B]`
  - `A` is the type of the parameter
  - `B` is the return type
- equivalent
  - `val gof: String => Boolean = { s => g(f(s)) }`
  - `val gof: String => Boolean = f.andThen(g)`
- fallbacks
  - `val zero: PartialFunction[Int, Double] = { case _ => 0 }`
  - `def sqrtOrZero(n: Int): Double = sqrt.orElse(zero)(n)`
- Exception handling
  - used in the catch portion
  - don't use exceptions in our programs
- 
