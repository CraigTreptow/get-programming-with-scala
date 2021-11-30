# Chapter 27

## List
- Immutable by default
  - using mutable lists is discouraged
- creation
  - not really used - `now ::(1, ::(2, Nil))`
  - better(and used) - `1 :: 2 :: Nil`
  - best - `List(1, 2)`
- append
  - `someList :+ somethingToAdd`
- prepend
  - `somethingToAdd +: someList`
- concatenate
  - `listA ++ listB`
- pattern matching
  - `case a :: Nil =>` - a is the head of the list
  - `case List(a) =>` - a is the head of the list
  - `case Nil =>` - empty list
  - `case List() =>` - empty list
  - `case cs =>` - any list
  - `::` lets you match more complex conditions
    - e.g. 3 elements - `case a :: b :: c :: tail =>`
  - 
