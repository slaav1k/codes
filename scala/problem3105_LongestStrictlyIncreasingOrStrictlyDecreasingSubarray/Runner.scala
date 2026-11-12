package problem3105_LongestStrictlyIncreasingOrStrictlyDecreasingSubarray

object Runner {
  def main(array: Array[String]): Unit = {
    println(Solution.longestMonotonicSubarray(Array(1, 4, 3, 3, 2)))
    println(Solution.longestMonotonicSubarray(Array(3, 3, 3, 3)))
    println(Solution.longestMonotonicSubarray(Array(3, 2, 1)))
  }
}
