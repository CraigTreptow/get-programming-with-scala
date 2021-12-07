# Chapter 36

## Map
- immutable, of course
- key/value pairs
- keys are unordered and unique
- each entry (key/value pair) is a `Tuple`
- they have types - `Map[K,V]`
- can `+` on a new `(key -> value)`
- existing key's values are replaced when adding same key
- can `-` with a key to remove
- can `++` to merge two maps
  - keys in the second map override the values from the first
- can `--` a `Set` of keys to remove them from the `Map`
- can `map`, `flatMap` 
- can use for comprehension
  - to replace `flatMap` on a `Map`
- 
