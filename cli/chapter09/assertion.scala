object Assertion {
  @main def main() = {
    byNameAssert(5 < 3)
  }
  def myAssert(predicate: () => Boolean) = {
    var assertionsEnabled = true
    if (assertionsEnabled && !predicate())
      throw new AssertionError
  }

  def byNameAssert(predicate: => Boolean) = {
    var assertionsEnabled = true
    if (assertionsEnabled && !predicate)
      throw new AssertionError
  }
}
