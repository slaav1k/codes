package problem2778_SumOfSquaresOfSpecialElements

object Solution {
  def sumOfSquares(nums: Array[Int]): Int = {
    var sum = 0
    val n = nums.length
    for (i <- 1 to n) {
      val t = nums(i - 1)
      if (n % i == 0) sum += t * t
    }
    sum
  }
}
