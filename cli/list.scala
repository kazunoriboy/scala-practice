object list_prac {
  def sample() = {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo)
    println(threeFour)
    println(oneTwoThreeFour)
    
  }

  @main def cons() = {
    val oneTwoThree = 1 :: 2 :: 3 :: Nil
    println(oneTwoThree)
  }
}
