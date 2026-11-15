package problem0925_LongPressedName

object Runner {
  def main(array: Array[String]): Unit = {
    println(Solution.isLongPressedName("alex", "aaleex"))
    println(Solution.isLongPressedName("saeed", "ssaaedd"))
  }
}
