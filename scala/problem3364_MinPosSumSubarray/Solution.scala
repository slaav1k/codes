package problem3364_MinPosSumSubarray

object Solution {
  def minimumSumSubarray(nums: List[Int], l: Int, r: Int): Int = {
    val arr = nums.toArray
    val n = arr.length
    var minSum = Int.MaxValue
    var tmpSum = 0

    for (len <- l to r) {
      tmpSum = 0
      for (i <- 0 until len if i < n) {
        tmpSum += arr(i)
      }

      if (len <= n) {
        if (tmpSum > 0) minSum = Math.min(minSum, tmpSum)

        for (i <- len until n) {
          tmpSum += arr(i) - arr(i - len)
          if (tmpSum > 0) minSum = Math.min(minSum, tmpSum)
        }
      }
    }
    if (minSum == Int.MaxValue) -1 else minSum
  }
}
