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
