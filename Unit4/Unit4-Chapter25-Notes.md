# Chapter 25

## Tuple
- Use to group data without a specific representation
- `val (some, data) = functionReturningTuple()`
- minimum: 1 item
- maximum: 22 items
- containing 2 elements
  - `val stuff = 1 -> 2` equals `(1,2)`
  - `1 -> 2 -> 3` equals `((1,2),3)`
- also getters
  - `stuff._1`
  - better to assign values as above
- can also ignore
  - `val (a, b, _) = ("hello", "scala", "!")`
- use for temporary grouping of data
  - short, consise fragments of code to make more readable

## Unapply
- define in a companion object for a class
- allows details to be ignored when pattern matching
- return type is Option
- compiler adds to case classes automatically
- 