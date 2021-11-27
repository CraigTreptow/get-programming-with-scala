# Chapter 24

## Working with Option: for-comprehension
- for comprehensions
  - syntatic sugar for nested `map` and `flatMap` calls
  - `yield` a value at the end
  - can embed `if` to either return the `Some` or `None`
- Other operations on `Option`
  - `isDefined`
  - `isEmpty`
  - `getOrElse`
    - provides default if empty(`None`)
  - `find`
    - returns value if predicate is satisfied
  - `exists`
    - combines `find` with `isDefined`
  - *DO NOT USE `get` ON AN `Option`*
    - if not there, it will throw an error
    - the compiler can no longer guarantee no runtime exceptions
  - 
