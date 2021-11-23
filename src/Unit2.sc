def objInfo(param: Any) = param match {
  case n: Int if n > 0 => s"$n is a positive integer"
  case d: Double =>  s"$d is a double"
  case "ping" => "pong"
  case _: String => "you gave me a string"
  case obj => obj.toString
}
objInfo(-1)
objInfo(true)

def discount(price: Double): Double = price match
  case p if p < 50 => price
  case p if p < 100 => price * .9
  case _ => price * .85

println(discount(50))
println(discount(51))
println(discount(100))
