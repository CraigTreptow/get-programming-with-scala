Map((1,"hi"), (2,3))

val res = for {
  (w, n) <- Map("hello" -> 1, "scala" -> 10)
  if w.length > n
} yield w -> n

println(res)