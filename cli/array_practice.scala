object array_practice {
  def test() = {
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"

    for (i <- 0 to 2)
      print(greetStrings(i))
  }

  @main def simpleArray() = {
    val numNames = Array("zero", "one", "two")

    for (i <- 0 to 2)
      print(numNames(i))
  }
}
