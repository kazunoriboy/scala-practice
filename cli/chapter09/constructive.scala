object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  def fileEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yeild file

  def fileRegex(query: String) =
    for (file <- filesHere; if file.getName.matches(query))
      yield file

}
