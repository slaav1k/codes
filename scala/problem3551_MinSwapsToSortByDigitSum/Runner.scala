package problem3551_MinSwapsToSortByDigitSum

object Runner {
    def main(array: Array[String]): Unit = {
      println(Solution.minSwaps(Array(37, 100)))
      println(Solution.minSwaps(Array(22,14,33,7)))
    }
}
