import scala.io.Source

object FindLine {
  def main(args: Array[String]) = {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      LongLine.processFile(arg, width)
  }
}

object LongLine {
  def processFile(filename: String, width: Int) = {
    def processLine(line: String) = {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }
}
