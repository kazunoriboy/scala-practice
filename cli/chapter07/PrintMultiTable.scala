object PrintMultiTable {
  @main def main = {
    var i = 1
    // ここではiだけがスコープに入っている

    while (i <= 10) {
      var j = 1
      // ここではiとjがスコープに入っている

      while (j <= 10) {
        val prod = (i * j).toString
        // ここではiとjとprodがスコープに入っている

        var k = prod.length
        // ここではiとjとprodとkがスコープに入っている

        while (k < 4) {
          print(" ")
          k += 1
        }
        print(prod)
        j += 1
      }
      // iとjはまだスコープに入っているが、prodとkはもう入っていない

      println()
      i += 1
    }
    // iはまだスコープに入っているが、j,prod,kはもう入っていない
  }
}
