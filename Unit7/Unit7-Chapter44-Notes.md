# Chapter 44

## Working with Future: map and flatMap
- nothing happens if future completes with failure
- if completes with success, map is done
- flatten/flatMap
  - combine nested Futures into one
  - It is implied that both must complete(successfully)
- so map/flatMap wait for all Futures to complete
  - synchronizing
- 
