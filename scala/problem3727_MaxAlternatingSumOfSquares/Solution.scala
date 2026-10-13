package problem3727_MaxAlternatingSumOfSquares

object Solution {
  def maxAlternatingSum(nums: Array[Int]): Long = {
    val sorted_nums = nums.map(x => x.toLong * x).sorted
    val n = sorted_nums.length
    val mid = n / 2
    
    var score = 0L
    var square = 0L
    
    for (i <- 0 until n) {
      square = sorted_nums(i)
      if (i < mid) {
        score -= square
      } else {
        score += square
      }
    }
    score
  }
}
