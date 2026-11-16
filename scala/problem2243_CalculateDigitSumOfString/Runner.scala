package problem2243_CalculateDigitSumOfString

object Runner{
    def main(array: Array[String]): Unit = {
      println(Solution.digitSum("11111222223", 3))
      println(Solution.digitSum("00000000", 3))
    }
}
