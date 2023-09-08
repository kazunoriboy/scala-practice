object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  def fileEnding(query: String) =
    fileMatching(query, _.endsWith(_))

  def filesContaining(query: String) =
    fileMatching(query, _.contains(_))

  def fileRegex(query: String) =
    fileMatching(query, _.matches(_))

  def filesMatching(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
      yield file:
  }
}
