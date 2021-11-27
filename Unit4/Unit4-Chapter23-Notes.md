# Chapter 23

## Working with Option: map and flatMap
- Use `map` on an `Option`
  - if value is present, it applies the function and returns a wrapped optional value
  - if the value is absent, it will return `None` without applying any function
- Use `flatten`
  - combine multiple optional values into one
  - e.g. `car.owner.map(_drivingLicense).flatten`
    - instead of return type `Option[Option[String]]`
  - can use multiple times to flatten more than two `Option`s
- Use `flatMap`
  - Instead of combing `map` and `flatten`
  - avoids nested pattern matching to deal with nested options
- 
