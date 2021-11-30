
def sum(elems: List[Int], acc: Int = 0): Int = {
  elems match {
    case Nil => acc
    case head :: tail => sum(tail, head + acc)
  }
}

val nums = List(1, 2, 3, 4, 5)
println(sum(nums))
