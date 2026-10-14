package problem3723_MaxSizeSumOfSquaresOfDigits

object Solution {
  def maxSumOfSquares(num: Int, sum: Int): String = {
    if (sum > 9L * num || sum < 1) {
      return ""
    }

    val result = new Array[Char](num)
    var rem = sum
    
    // жадный алгоритм
    for (i <- 0 until num) {
      val digit = math.min(9, rem)
      result(i) = (digit + '0').toChar
      rem -= digit
    }

    new String(result)
  }
}