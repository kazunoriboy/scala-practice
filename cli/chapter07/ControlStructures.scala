object ControlStructures {
  def main(args: Array[String]) = {
    println(ifSyntax(args))
    println(whileSyntax(10L, 32L))
  }

  def ifSyntax(args: Array[String]) = {
    val filename = 
      if (!args.isEmpty) args(0)
      else "default.txt"
  }

  def whileSyntax(x: Long, y: Long) = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }
}
