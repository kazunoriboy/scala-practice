trait Philosophical {
  def philosophize() = {
    println("I consume memory, therefore I am!")
  }
}

trait HasLegs

class Animal

class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "green"

  override def philosophize() = {
    println("It ain't easy being " + toString + "!")
  }
}

@main def testTrait(): Unit = {
  val frog = new Frog
  frog.philosophize()
  println(frog)

  val phil: Philosophical = frog
  phil.philosophize()
}
