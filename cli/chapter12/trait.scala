trait Philosophical {
  def philosophize() = {
    println("I consume memory, therefore I am!")
  }
}


class Frog extends Philosophical {
  override def toString = "green"
}

@main def testTrait(): Unit = {
  val frog = new Frog
  frog.philosophize()
  println(frog)

  val phil: Philosophical = frog
  phil.philosophize()
}
