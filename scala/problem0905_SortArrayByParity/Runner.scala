package problem0905_SortArrayByParity

object Runner {
  def main(array: Array[String]): Unit = {
    println(Solution.sortArrayByParity(Array(3, 1, 2, 4)).mkString("Array(", ", ", ")"))
    print(Solution.sortArrayByParity(Array(0)).mkString("Array(", ", ", ")"))
  }

}
