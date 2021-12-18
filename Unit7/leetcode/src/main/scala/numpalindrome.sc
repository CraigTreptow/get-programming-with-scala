object Solution {
  def isPalindrome(x: Int): Boolean = {
    x.toString == x.toString.reverse
  }
}

println(Solution.isPalindrome(10))
