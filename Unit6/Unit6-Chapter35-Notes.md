# Chapter 35

## Working with Set
- `union`
- `intersect`
- `diff`
  - A diff B != B diff A
  - `topicA.diff(topicB)` - no topic B in result
  - All of these are equivalent
    - `Set(1,2,3).diff(Set(1,4)`
    - `Set(1,2,3) diff Set(1,4)`
    - `Set(1,2,3) -- Set(1,4)`
- `exists`
  - give it a predicate
- `filter`
- `contains`
- `maxBy`
- Cannot
  - `sorted`
  - `sortedBy`
  - It is unordered by definition
- 
