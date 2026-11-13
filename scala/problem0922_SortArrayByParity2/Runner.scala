package problem0922_SortArrayByParity2

object Runner {
  def main(array: Array[String]): Unit = {
    println(Solution.sortArrayByParityII(Array(4, 2, 5, 7)).mkString("Array(", ", ", ")"))
    print(Solution.sortArrayByParityII(Array(2, 3)).mkString("Array(", ", ", ")"))
  }
}