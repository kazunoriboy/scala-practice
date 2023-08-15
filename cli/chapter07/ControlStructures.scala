object ControlStructures {
  def main(args: Array[String]) = {
    nestedFilter()
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

  def forSyntax() = {
    val filesHere = (new java.io.File(".")).listFiles
    for (file <- filesHere)
      println(file)
  }
  
  def filteringFor() = {
    val filesHere = (new java.io.File(".")).listFiles
    for (
       file <- filesHere
       if file.isFile
       if file.getName.endsWith(".scala")
    )
      println(file)
  }

  def nestedFilter() = {
    grep(".*file.*") 
  }

  def fileLines(file: java.io.File) = 
    scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern: String) = {
    val filesHere = (new java.io.File(".")).listFiles
    for (
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- fileLines(file)
      if line.trim.matches(pattern)
    )
      println(file.getName + ": " + line.trim)
  }
}
