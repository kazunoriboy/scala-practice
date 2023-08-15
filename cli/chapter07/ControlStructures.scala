object ControlStructures {
  def main(args: Array[String]) = {
    matchSyntax(args)
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

    for {
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    }
      println(s"$file: $trimmed")
  }

  def scalaFiles = 
    for {
      file <- (new java.io.File(".")).listFiles
      if file.getName.endsWith(".scala")
    } yield file

  def matchSyntax(args: Array[String]) = {
    val firstArg = if (args.length > 0) args(0) else "" 

    firstArg match {
      case "salt" => println("pepper")
      case "chips" => println("salsa")
      case "eggs" => println("bacon")
      case _ => println("huh?")
    }
  }

}
