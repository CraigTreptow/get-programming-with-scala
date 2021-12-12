# Chapter 43

## Future
- The JVM is multi-threaded
- a `Future` is a thread in the JVM
- `import scala.concurrent.Future`
- uses an implicit parameter of type `ExecutionContext`
- the EC gives the future a thread pool
  - usually it is `ExecutionContext.global`
  - use as implicit with
    - `import scala.concurrent.ExecutionContext.Implicits.global`
- cannot pattern match on a `Future` type
- use `onComplete` to call a function once completed
  - result is lost
  - use `map` to retain the result
    - `Future(10/2).onComplete { blah }`
- 
