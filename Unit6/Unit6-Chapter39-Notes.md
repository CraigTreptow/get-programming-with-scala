# Chapter 39

## Working with Either
- `getOrElse`
  - `outcome.left.getOrElse("some message")`
- check which it is
  - `isRight` or `isLeft`
- apply a predicate
  - `outcome.exists(pass => pass.score >= 80)`
- 
