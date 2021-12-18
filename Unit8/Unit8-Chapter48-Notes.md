# Chapter 48

## JSON (de)serialization
- uses `circe`
- `asJson` to get json out of something
  - `List("Hello", "World").asJson`
- the trait `Decoder` defines how to create an instance from json
- unrelated
  - using triple quotes automatically escapes special characters
  - `""" { "fullName": "John Doe" } """`
- `decode[Person](goodData)`
  - produces a `Person` from json
  - returns `Either`
    - `Left` is an error
    - `Right` is the object you wanted
- can derive decoders from a case class using `deriveDecoder`
- 
