package problem0914_XofKindInDeckOfCards

object Runner {
  def main(array: Array[String]): Unit = {
    println(Solution.hasGroupsSizeX(Array(1, 2, 3, 4, 4, 3, 2, 1)))
    println(Solution.hasGroupsSizeX(Array(1, 1, 1, 2, 2, 2, 3, 3)))
  }

}
