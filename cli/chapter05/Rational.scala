class Rational(n: Int, d: Int) {
  require(d != 0)
  override def toString = s"$n/$d"

  def add(that: Rational): Rational = {
    new Rational(n * that.d + that.n * d, d * that.d)
  }
}

object Rational {
  @main def main(): Unit = {
    val r = new Rational(1, 2)
    val r2 = new Rational(2, 3)
    println(r.add(r2))
  }
}

