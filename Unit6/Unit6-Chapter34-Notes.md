# Chapter 34

## Set
- is immutable
- Contents are unique
- Contents have no order
- Contents may be of different types
- Adding/Removing
  - `Set(1, 2) + 3`
  - `Set(1, 2, 3) - 2`
  - happen in constant time
  - How is removing done in constant time?
    - Oh, in each case, it must see if the element is in the set already
    - which takes `O(n)` (linear time) in both cases
    - the add/remove can then be done, taking the same time for each
- can `map`
- cam `flatten`
- can `flatMap`
- 
