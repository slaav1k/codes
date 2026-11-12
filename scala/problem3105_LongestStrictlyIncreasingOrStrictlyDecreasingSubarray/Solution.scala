package problem3105_LongestStrictlyIncreasingOrStrictlyDecreasingSubarray

object Solution {
  def longestMonotonicSubarray(nums: Array[Int]): Int = {
    if (nums.isEmpty) return 0

    var kMx = 1
    var kTmp = 1
    var high = 0

    for (i <- 0 until nums.length - 1) {
      if (nums(i) < nums(i + 1)) {
        if (high == 1) {
          kTmp += 1
        } else {
          kTmp = 2
          high = 1
        }
      } else if (nums(i) > nums(i + 1)) {
        if (high == 2) {
          kTmp += 1
        } else {
          kTmp = 2
          high = 2
        }
      } else {
        kTmp = 1
        high = 0
      }

      kMx = math.max(kMx, kTmp)
    }

    kMx
  }
}
