import scala.collection.mutable

object set_prac {
  def immutableSet() = {
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))
    println(jetSet)
  }

  @main def mutableSet() = {
    val movieSet = mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)
  }
}
