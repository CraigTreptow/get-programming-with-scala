# Chapter 50

## The IO type
- this is `cats.effect.IO`
- consider `IO` as the lazy alternative to eagerly evaluated `Future`
- represent side effects lazily
- `Future` is not referentially transparent, `IO`is
- `IO` can be cancelled, `Future` cannot be
- 
