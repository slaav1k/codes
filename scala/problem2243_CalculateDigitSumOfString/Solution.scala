package problem2243_CalculateDigitSumOfString

object Solution {
  def digitSum(s: String, k: Int): String = {
    var current = s

    while (current.length > k) {
      current = current
        .grouped(k)
        .map(group => group.map(_.asDigit).sum.toString)
        .mkString("")
    }

    current
  }
}
