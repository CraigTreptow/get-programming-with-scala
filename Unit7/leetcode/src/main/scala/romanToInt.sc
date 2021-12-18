object Solution {
  def romanToInt(s: String): Int = {
    val firstLetter = s.slice(0,1)
    valForLetter(firstLetter)
  }

  def valForLetter(l: String): Int = l match {
    case "I" => 1
    case "V" => 5
    case "X" => 10
    case "L" => 50
    case "C" => 100
    case "D" => 500
    case "M" => 1000
    case _ => 0
  }
}

val r = "MCMXCIV"
println(r.length)
println(r.slice(0,1))
println(r.slice(0,2))
println(r.toList)
println(Solution.romanToInt(r))
