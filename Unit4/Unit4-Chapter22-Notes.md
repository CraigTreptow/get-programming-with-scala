# Chapter 22

## Option
- Use instead of `null`
- `val optInt: Option[Int] = Some(2)`
- type inference is used
  - you only need `Some(1)`
  - rather than `Some[Int](1)`
- `Nothing`
  - is subclass of every other class
  - at bottom of class hierarchy
- `Any`
  - is superclass of every other class
  - is root of the class hierarchy
- `None` is instance of the class `Option`
- `Nothing` is a type you can associate with any other type
- `null` is a keyword, indicating a missing reference to an object
- can convert partial functions to full
  - return type is an `Option`
  - return `None` when any errors, etc.
- 
