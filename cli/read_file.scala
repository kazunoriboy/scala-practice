import scala.io.Source

object reader {
  def widthOfLength(s: String) = s.length.toString.length

  def main (args: Array[String]): Unit = {
    if (args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines.toList
    }
    else
      Console.err.println("Please enter filename")
  }
}
