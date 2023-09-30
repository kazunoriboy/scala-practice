object filer {
  def main () {
    val file = new File("date.txt")

    withPrintWriter(file) {
      writer => writer.println(new java.util.Date)
    }
  }
  def withPrintWriter(file: File)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }
}
