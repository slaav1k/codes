package problem2333_MinSumOfSquaredDiff

object Runner {
  def main(array: Array[String]): Unit = {
    val nums1 = Array(1, 2, 3, 4)
    println(Solution.minSumSquareDiff(Array(1, 2, 3, 4), Array(2, 10, 20, 19), 0, 0))
    println(Solution.minSumSquareDiff(Array(1, 4, 10, 12), Array(5, 8, 6, 9), 1, 1))
  }

}
