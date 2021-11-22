# Chapter 11

## Singleton objects
- Instantiate only once
- has static methods
  - non-static are on class instances
- `object` *only* refers to a singleton, not an instance

## Entry Point
- need an `object` with a `main` function
- Specifically for v2:
  - `def main(args: Array[String]): Unit = ???`
- and for v3:
  - `@main def hello: Unit = ???`
  - `@main` automatically extracts command line arguments
    - and ensures they match the signature

## Companion object
- has same name as an existing class
- has static methods related to class
  - but doesn't belong to a specific instance

## `apply` method
- can provide different ways of creating a class
- `Person.apply(tom, alice)` == `Person(tom, alice)`

## `unapply` method
- lives on the companion object
- takes a class instance and returns its decomposed representation
- used with pattern matching

## v2 vs v3
- `new Test(5)` - v2
- `Test(5)` - v3


