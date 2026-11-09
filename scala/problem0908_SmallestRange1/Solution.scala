package problem0908_SmallestRange1

object Solution {
  def smallestRangeI(nums: Array[Int], k: Int): Int = {
    val minVal = nums.min
    val maxVal = nums.max
    math.max(0, (maxVal - k) - (minVal + k))
  }

  def smallestRangeII(nums: Array[Int], k: Int): Int = {
    val sortedNum = nums.sorted
    val n = sortedNum.length
    var ans = sortedNum(n - 1) - sortedNum(0)
    var new_min = 0
    var new_max = 0

    for (i <- 0 until n - 1) {
      new_min = math.min(sortedNum(0) + k, sortedNum(i + 1) - k)
      new_max = math.max(sortedNum(i) + k, sortedNum(n - 1) - k)
      ans = math.min(ans, new_max - new_min)
    }

    ans
  }
}