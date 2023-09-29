object loop {
  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = true
    exists
  }

  def contansNeg2(nums: List[Int]) = nums.exists(_ < 0)

  def containsOdd(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num % 2 == 1)
        exists = true
    exists
  }

  def containsOdd2(nums: List[Int]) = nums.exists(_ % 2 == 1)
}

