var marksSum = 0
var marksCount = 0
var lowestMark = 3
var highestMark = 0

def averageMark: Double =
  marksSum.toDouble / marksCount


def markExam(q1: Double, q2: Double, q3: Double): Int =
  val avgScore = (q1 + q2 + q3) / 3
  val scaledScore = avgScore * 10 / 3
  val mark = Math.round(scaledScore).toInt
  if mark > highestMark then highestMark = mark
  if mark < lowestMark then lowestMark = mark

  marksSum += mark  // bad.  what are we doing modifying those values outside of this function?
  marksCount += 1     // ditto
  mark

markExam(1.2, 3, 2.4)
markExam(1.3, 2.1, 3)
markExam(0.3, 1.1, 3)

println(averageMark)
println(highestMark)
println(lowestMark)

def discount(price: Double): Double =
  if (price < 50) then price
  else if (price < 100) then price * .9
  else price * .85

println(discount(50))
println(discount(51))
println(discount(100))

def pow(exponent: Int, base: Int): Int =
  var acc = 1
  for (i <- 1 to exponent) {
    acc = acc * base
  }
  acc

println(pow(3,2))
println(Math.pow(2,3))
println(pow(2,3))
println(Math.pow(3,2))
