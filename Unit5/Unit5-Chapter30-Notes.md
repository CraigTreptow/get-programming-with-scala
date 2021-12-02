# Chapter 30

## Working with List: Element selection
- `.apply(2)`
  - gets the nth element (zero based index) 
- `head`
  - gets the first element
- `head` and `apply(0)` are both impure
  - they throw exceptions if empty
- `headOption`
  - the pure alternative
- `find`
  - find element by attribute, rather than position
  - based on a predicate (of course)
  - `List(0,1,2).find(_ <= 1`
- `max` & `min`
  - both depend on an `Ordering[A]` existing 
- `.maxBy(_.n)` & `.minBy(_.n)`
  - gets the max/min based on the attribute `n`
- 
