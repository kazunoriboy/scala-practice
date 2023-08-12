class Rational(n: Int, d: Int) {
  override def toString = s"$n/$d"
}

object Rational {
  @main def main(): Unit = {
    val r = new Rational(1, 2)
    println(r)
  }
}

