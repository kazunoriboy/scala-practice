abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}

class ArrayElement(
  val contents: Array[String]
) extends Element {
}

class LineElement(s: String) extends ArrayElement(Array(s)) {
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

class Cat {
  val dangerous = false
}

class Tiger(
  override val dangerous: Boolean,
  private var age: Int
) extends Cat

@main def main() = {
  val ae = new ArrayElement2()
  invokeDemo(ae)
  val le = new LineElement2()
  invokeDemo(le)
  val ue = new UniformElement2()
  invokeDemo(ue)
}

abstract class Element2 {
  def demo() = {
    println("Element's implementation invoked")
  }
}

final class ArrayElement2 extends Element2 {
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
