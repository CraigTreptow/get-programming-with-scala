# Chapter 19

## Case classes
- Compiler adds convenience methods for us
  - they are immutable
  - getters for each parameter
  - `copy` function
    - used to change field(s) value(s)
  - `toString`
    - overridden to be a "nice" string
  - `hashCode`
    - considers only structure, rather than structure and memory allocation
    - two classes with same type and structure have the same hash code
  - `equals`
    - regular classes check for the same memory allocation
    - case classes only checks for the same type and structure
- v2
  - uses universal equality
  - `true == "true"` - compiler warning
- v3
  - uses strict equality
  - `"true == true` - will not compile
  - must be of the same type
- companion objects are generated with the case class
  - companion implements the `apply` and `unapply` methods
- pattern matching
  - can bind the entire class in a match
  - `case p @ Person(_,18) => s"{p.name}, you look older!"`
- 
