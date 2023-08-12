class Rational(n: Int, d: Int) {
  require(d != 0)
  override def toString = s"$n/$d"
}

object Rational {
  @main def main(): Unit = {
    val r = new Rational(1, 2)
    println(r)
  }
}

