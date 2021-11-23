trait Animal {
  def sleep = "ZzZ"
  def eat(food: String): String
  def move(x: Int, y: Int): String
}

// trait Nameable {
//   def name: String
// }

trait Nameable(name: String) // param is v3 only

class Cat extends Animal:
  override val sleep = "sleepy cat!"
  def eat(food: String) = s"the cat is eating $food"
  def move(x: Int, y: Int) = s"the cat is moving to ($x, $y)"

class Dog(val name: String) extends Animal with Nameable(name):
  def eat(food: String) = s"$food $food"
  def move(x: Int, y: Int) = "let's go to ($x, $y)!"

val tiggerTheDog = new Dog("Tigger")
val cat = new Cat

def feedTreat(animal: Animal) = animal.eat("treat")

feedTreat(tiggerTheDog)
feedTreat(cat)

def welcome(nameable: Nameable) =
  println(s"Hi, ${nameable.name}!")

// can't find.  Why?
// welcome(tiggerTheDog)
// welcome(cat)     // won't compile, cat doesn't extend Nameable

// union type aka coproduct
sealed trait Suit1
object Clubs extends Suit1
object Diamonds extends Suit1
object Hearts extends Suit1
object Spades extends Suit1

sealed trait Currency
object USD extends Currency
object CAD extends Currency
object EUR extends Currency

enum CurrenSee
case USD, CAD, EUR

// scala v3
enum Suit2 {
  case Clubs, Diamonds, Hearts, Spades
}

println(Suit2.Hearts)
println(Suit2.values)
println(Suit2.fromOrdinal(0))

enum Country(val code: String):
  case Italy extends Country("IT")
  case UnitedKingdom extends Country("UK")
  case UnitedStates extends Country("US")
  case Japan extends Country("JP")

// neat!
println(Country.Italy.code)


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
