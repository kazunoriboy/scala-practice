object filer {
  def main () {
    withPrintWriter(
      new File("date.txt"),
      writer => writer.println(new java.util.Date)
    )
  }
  def withPrintWriter(file: File, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }
}
