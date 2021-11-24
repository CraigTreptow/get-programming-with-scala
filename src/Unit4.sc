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
