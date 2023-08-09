object immu_map {
  @main def use_immu_map() = {
    val romanNumeral = Map(
      1 -> "I" , 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    println(romanNumeral(4))
  }
}
