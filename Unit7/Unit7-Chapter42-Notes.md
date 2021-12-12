# Chapter 42

## Implicit and type classes
- Unrelated
  - type aliases
  - `type Result = Either[String, (Int, Int)]`
  - `def divide(x: Int, divisor< Int): Result =`
- `implicit` v3 `given`
  - compiler adds the argument for you

### Type classes
- ad hoc polymorphism
- ad hoc - behavior can be overridden
- uses example of trait `Show`
  - it's from the `cats` library
  - why on earth is this brought up out of the blue here?
- 
