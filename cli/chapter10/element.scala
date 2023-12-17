abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
  def above(that: Element): Element =
    new ArrayElement(this.contents ++ that.contents)
  def beside(that: Element): Element = {
    new ArrayElement(
      for (
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )
  }
}

class ArrayElement(
  val contents: Array[String]
) extends Element {
}

class LineElement(s: String) extends Element {
  val contents = Array(s)
  override def width = s.length
  override def height = 1
}

class UniformElement(
  ch: Char,
  override val width: Int,
  override val height: Int
) extends Element {
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}

object Element {
  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)
  
  def elem(chr: Char, width: Int, height: Int): Element =
    new UniformElement(chr, width, height)

  def elem(line: String): Element =
    new LineElement(line)
}

class Cat {
  val dangerous = false
}

class Tiger(
  override val dangerous: Boolean,
  private var age: Int
) extends Cat

@main def main() = {
  val ae = new ArrayElement(Array("hello", "world"))
  val ae2 = new ArrayElement(Array("aaaaa", "bbbbb"))
  println(ae.above(ae2).height)
  println(ae.beside(ae2).width)
  val ae3 = ae.beside(ae2)
  for (line <- ae3.contents)
    println(line)
}

abstract class Element2 {
  def demo() = {
    println("Element's implementation invoked")
  }
}

class ArrayElement2 extends Element2 {
  override def demo() = {
    println("ArrayElement's implementation invoked")
  }
}

class LineElement2 extends ArrayElement2 {
  override def demo() = {
    println("LineElement's implementation invoked")
  }
}

class UniformElement2 extends Element2

def invokeDemo(e: Element2) = {
  e.demo()
}
