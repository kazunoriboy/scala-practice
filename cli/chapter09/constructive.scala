object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  def fileEnding(query: String) =
    fileMatching(_.endsWith(query))

  def filesContaining(query: String) =
    fileMatching(_.contains(query))

  def fileRegex(query: String) =
    fileMatching(_.matches(query))

  def filesMatching(matcher: String => Boolean) = {
    for (file <- filesHere; if matcher(file.getName))
      yield file:
  }
}
