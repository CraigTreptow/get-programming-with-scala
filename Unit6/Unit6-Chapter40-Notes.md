# Chapter 40

## Error handling with Try
- Unrelated on `.map`
  - `xs.map(x => x + 1)` vs
  - `for (x <- xs) yield x + 1`
  - `xs.filter(x => x % 2 == 0` vs
  - `for (x <- xs if x % 2 == 0) yield x`
  - `xs.filter(x => x % 2 == 0).map(x => x + 1)` vs
  - `for (x <- xs if x % 2 == 0) yield x + 1`
- use `Try` rather than `try/catch`
  - forces you to handle the good and bad cases at compile time
  - `import scala.util.{Failure, Success, Try}`
  - `val a: Try[Int] = Success(1)`
    - now a good result must be an integer
  - `val b: Try[Int] = Failure(new Exception("error"))`
    - failure needs a throwable
  - pattern matching must define both success and failure
- `map`, `flatten`, and `flatMap` are similar to `Option`
- alternatives to pattern matching
  - `Try(5/2).isSuccess`
  - `Try(5/2).isFailure`
- `getOrElse`
