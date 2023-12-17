import Element.elem

abstract class Element {
  def contents: Array[String]

  def width: Int = contents(0).length
  def height: Int = contents.length

  def above(that: Element): Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    elem(this1.contents ++ that1.contents)
  }

  def beside(that: Element): Element = {
    val this1 = this heighten that.width
    val that1 = that heighten this.width
    elem(
      for ((line1, line2) <- this1.contents zip that1.contents)
      yield line1 + line2)
  }

  def widen(w: Int): Element =
    if (w <= width) this
    else {
      val left = elem(' ', (w -width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right
    }

  def heighten(h: Int): Element =
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      val bot = elem(' ', width, h - height - top.height)
      top above this above bot
    }

  override def toString = contents mkString "\n"
}


object Element {
  private class ArrayElement(
    val contents: Array[String]
  ) extends Element {
  }

  private class LineElement(s: String) extends Element {
    val contents = Array(s)
    override def width = s.length
    override def height = 1
  }

  private class UniformElement(
    ch: Char,
    override val width: Int,
    override val height: Int
  ) extends Element {
    private val line = ch.toString * width
    def contents = Array.fill(height)(line)
  }

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
  val ae = elem(Array("hello", "world", "!"))
  val ae2 = elem(Array("this", "is"))
  println(ae above ae2)
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
