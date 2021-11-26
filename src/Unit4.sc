case class Author(forename: String, surname: String)

sealed trait Genre
case object Drama extends Genre
case object Horror extends Genre
case object Romantic extends Genre

case class Book(title: String, author: Author, genre: Genre)

val a = Author("Craig", "Treptow")
val b = Book(title = "Hey", author = a, genre = Drama)

println(b)
println(b.title)
println(b.author)
println(b.genre)

sealed trait Mode
case object Length extends Mode
case object Letters extends Mode
case object Uppers extends Mode
case object Digits extends Mode

def predicateSelector(mode: Mode): Char => Boolean =
  mode match
    case Length => _ => true
    case Letters => _.isLetter
    case Uppers => _.isUpper
    case Digits => _.isDigit

def stats(s: String, predicate: Char => Boolean = { _ => true } ): Int = s.count(predicate)

val text = "This is the example."
println(stats(text, predicateSelector(Length))) // all chars
println(stats(text, predicateSelector(Uppers))) // uppercase

def sqrt(n: Int): Option[Double] =
  if (n >= 0) Some(Math.sqrt(n)) else None

def sqrtOrZero(n: Int): Double =
  sqrt(n) match {
    case Some(result) => result
    case None => 0
  }

