# Chapter 32

## Working with List: Sorting and other operations
- `sorted`
- `sortBy`
  - give function `A` to `B`
  - use a Tuple for multiple criteria
- `reverse`
- shuffle
  - `scala.util.Random`
  - `Random.shuffle(List(1,2,3))`
- `mkString`
  - invokes `toString` on each element
  - using a separator ("" by default)
  - may also provide prefix/suffix strings
    - `mkString("[", "-", "]")`
- `sum`
  - type must have implementation of `Numeric[A]`
  - examples: `Byte, Short, Int, Long, Float, Double, BigInt`
- `groupBy`
  - `addressBook.groupBy(_.company)`
  - returns `Map`
- 
