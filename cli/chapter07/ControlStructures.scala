object ControlStructures {
  def main(args: Array[String]) = {
    println(ifSyntax(args))
  }

  def ifSyntax(args: Array[String]) = {
    val filename = 
      if (!args.isEmpty) args(0)
      else "default.txt"
  }
  }
}
