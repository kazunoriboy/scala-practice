abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}

class ArrayElement(
  val contents: Array[String]
) extends Element {
}

class Cat {
  val dangerous = false
}

class Tiger(
  override val dangerous: Boolean,
  private var age: Int
) extends Cat

@main def main() = {
  val tiger = new Tiger(true, 10)
  println(tiger)
}
