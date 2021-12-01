
def sum(elems: List[Int], acc: Int = 0): Int = {
  elems match {
    case Nil => acc
    case head :: tail => sum(tail, head + acc)
  }
}

val nums = List(1, 2, 3, 4, 5)
println(sum(nums))

def triple(ns: List[Int]): List[Int] =
  ns.flatMap(n => List(n, n, n))

def triple2(ns: List[Int]): List[Int] =
  for {
    n <- ns
    i <- List(n,n,n)
  } yield i

println(triple(nums))
println(triple2(nums))

println(List("").isEmpty)
