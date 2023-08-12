class Rational(n: Int, d: Int) {
  require(d != 0)
  val number: Int = n
  val denom: Int = d
  override def toString = s"$number/$denom"

  def add(that: Rational): Rational = {
    new Rational(
      number * that.denom + that.number * denom,
      denom * that.denom
    )
  }

  def lessThan(that: Rational) = {
    this.number * that.denom < that.number * this.denom
  }

}

object Rational {
  @main def main(): Unit = {
    val r = new Rational(1, 2)
    val r2 = new Rational(2, 3)
    println(r.add(r2))
  }
}

