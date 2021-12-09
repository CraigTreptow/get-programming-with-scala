# Chapter 38

## Either
- Popular use is validation
- right
  - synonym for correct
  - used for the "good" case
- left
  - used for the "bad" case
- `def something(x: Int): Either[String, String]`
  - then `Left("some error")`
  - or `Right(someData)`
- can access and use like this
  - `outcome.right.map(_.toPercentage)`
- `Either` is right-biased
  - if not told, the compiler assumes you want the right side
- 
