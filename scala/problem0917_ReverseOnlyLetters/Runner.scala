package problem0917_ReverseOnlyLetters

object Runner {
  def main(array: Array[String]): Unit = {
    println(Solution.reverseOnlyLetters("ab-cd"))
    println(Solution.reverseOnlyLetters("a-bC-dEf-ghIj"))
    println(Solution.reverseOnlyLetters("Test1ng-Leet=code-Q!"))
  }

}
