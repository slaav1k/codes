package problem3727_MaxAlternatingSumOfSquares

object Runner {
  def main(array: Array[String]): Unit = {
    println(Solution.maxAlternatingSum(Array(1, 2, 3)))
    println(Solution.maxAlternatingSum(Array(1, -1, 2, -2, 3, -3)))
  }

}
