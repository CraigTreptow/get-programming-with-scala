# Chapter 37

## Working with Map
- `get`
  - takes a key param
  - returns `Option[V]`
- `getOrElse`
  - takes element of type `K` and expression to produce a `V`
  - if key is missing you generate a value
  - otherwise get the value for the key
- `apply`
  - takes a key param
  - exception if key is not found
- use `get` or `getOrElse` instead
- `keys`
  - returns all keys in an `Iterable`
- `values`
  - returns all values in an `Iterable`
- implements `Iterable`
  - so you get things that are also in `List`
  - like min, max, size, filter, etc
  - cannot sort (no `sorted` or `sortBy`)
  - no `distinct`
  - `contains` takes a key (rather than a Tuple)
- 
