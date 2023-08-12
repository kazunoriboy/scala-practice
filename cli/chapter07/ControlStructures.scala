object ControlStructures {
  def main(args: Array[String]) = {
    var filename = "default.txt"
    if (!args.isEmpty)
      filename = args(0)
    println(filename)
  }
}
