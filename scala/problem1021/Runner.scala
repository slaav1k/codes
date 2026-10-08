package problem1021

object Runner {
  def main(array: Array[String]): Unit = {
    println(Solution.removeOuterParentheses("(()())(())"))
    println(Solution.removeOuterParenthesesOptimum("(()())(())(()(()))"))
    println(Solution.removeOuterParentheses("()()"))
  }
}
