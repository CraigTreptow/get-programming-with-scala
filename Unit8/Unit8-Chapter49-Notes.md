# Chapter 49

## Lazy evaluation
- `getOrElse`
  - key is eagerly evaluated (call by value)
  - default is lazily evaluated (call by name)
- evaluate function param lazily
  - `retry(n: Int, operation: => T): Try[T] =`
  - the `=>` evaluate this by name (lazily)
  - doesn't evaluate operation until retry is called again
    - like with recursion
- use `lazy val stats: Stats = new Stats()`
  - when initializing stats takes a long time
  - it will not evaluate stats until asked for later
  - not when you initialize a new person object
- 
