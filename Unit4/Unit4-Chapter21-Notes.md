# Chapter 21

## Purity
- Pure functions are total and have no side effects
  - totality
    - well-defined for every input
    - must terminate for every parameter value
    - and return an instance that matches the return type
    - recursion that doesn't terminate is not total
  - side effects
    - has observable interchange outside of its local scope
    - e.g. changes stuff elsewhere in your program
      - `println`, updating a counter defined in a class
- referential transparency
  - pure functions only depend on parameters
  - can replace invocation with return value
- no parameter parentheses?
  - omit if the function is pure
  - use if the function is impure
- 
