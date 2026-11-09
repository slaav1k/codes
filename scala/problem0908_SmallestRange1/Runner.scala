package problem0908_SmallestRange1

object Runner {
  def main(array: Array[String]): Unit = {
    println(Solution.smallestRangeI(Array(1), 0))
    println(Solution.smallestRangeI(Array(0, 10), 2))
    println(Solution.smallestRangeI(Array(1, 3, 6), 3))
  }

}
