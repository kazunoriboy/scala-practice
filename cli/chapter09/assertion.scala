object Assertion {
  @main def main() = {
    myAssert(() => 5 > 3)
  }
  def myAssert(predicate: () => Boolean) = {
    var assertionsEnabled = true
    if (assertionsEnabled && !predicate())
      throw new AssertionError
  }
}
