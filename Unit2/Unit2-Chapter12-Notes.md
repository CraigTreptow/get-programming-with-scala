# Chapter 12

## Traits as interfaces
- A class can inherit from one ore more traits
- use to define interfaces to a set of features
- `object HiThere extends App {`
  - `App` is a trait!

## Sealed traits
- limits the elements that extend it
- `sealed` tells compiler all components extending the trait are in the same file
- use to define union types (coproducts) e.g. suits of cards
- use `Enum` in v3


