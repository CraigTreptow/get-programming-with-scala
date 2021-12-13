# Chapter 45

## Working with Future: for-comprehension
- use to coordinate multiple `Future` instances
- deal with several parallel computations (Future)
  - `firstCompletedOf` - success or failure
  - `find` given a sequence of Futures
    - get first satisfying a predicate
  - `sequence`
    - produce a sequence of Futures in the same order
    - returns failure if any of them fail
- blocking
  - primarily for testing
  - use `Await` and `.ready`
    -check that a Future completes in the given time
      - success or failure
  - use `Await` and `.result`
    - check that a Future successfully creates a value in the given time
- 
