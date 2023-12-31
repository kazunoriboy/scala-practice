class Rational(n: Int, d: Int) extends Ordered[Rational] {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val number: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString = s"$number/$denom"

  def + (that: Rational): Rational = {
    new Rational(
      number * that.denom + that.number * denom,
      denom * that.denom
    )
  }

  def + (i: Int): Rational = {
    new Rational(
      number + i * denom,
      denom
    )
  }

  def - (that: Rational): Rational = {
    new Rational(
      number * that.denom - that.number * denom,
      denom * that.denom
    )
  }

  def - (i: Int): Rational = {
    new Rational(
      number - i * denom,
      denom
    )
  }

  def * (that: Rational): Rational = {
    new Rational(
      number * that.number,
      denom * that.denom
    )
  }

  def * (i: Int): Rational = {
    new Rational(
      number * i,
      denom
    )
  }

  def / (that: Rational): Rational = {
    new Rational(
      number * that.denom,
      denom * that.number
    )
  }

  def / (i: Int): Rational = {
    new Rational(
      number,
      denom * i
    )
  }

  def lessThan(that: Rational) = {
    this.number * that.denom < that.number * this.denom
  }

  def max(that: Rational) = {
    if (this.lessThan(that)) that else this
  }

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def compare (that: Rational) = this.number * that.denom - that.number * this.denom
}

object Rational {
  @main def main(): Unit = {
    implicit def intToRational(x: Int): Rational = new Rational(x)
    val x = new Rational(211, 240)
    val y = new Rational(3, 2)
    val i = 3;
    println(x < y)
  }
}

