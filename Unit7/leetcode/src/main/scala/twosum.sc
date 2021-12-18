// import Solution.twoSum

object Solution {
  var result:Array[Int] = _

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val numsToCheck = nums.filter(_ < target).sorted
    val l = numsToCheck.length

    for (i <- 0 until l) {
      for (j <- i + 1 until l) {
        if (numsToCheck(i) + numsToCheck(j) == target)result = Array(i, j)
      }
    }
  }

  result
}

Solution.twoSum(Array(1,3,4,2,15), 7)