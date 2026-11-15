package problem3364_MinPosSumSubarray

object Runner {
  def main(array: Array[String]): Unit = {
    println(Solution.minimumSumSubarray(List(3, -2, 1, 4), 2, 3))
    println(Solution.minimumSumSubarray(List(-2, 2, -3, 1), 2, 3))
    println(Solution.minimumSumSubarray(List(1, 2, 3, 4), 2, 4))
  }

}
