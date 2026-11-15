package problem3551_MinSwapsToSortByDigitSum

object Solution {
  def minSwaps(nums: Array[Int]): Int = {
    val n = nums.length

    val indexedSeq = nums.zipWithIndex.sortWith {
      case ((a, _), (b, _)) =>
        val sumA = getDigitSum(a)
        val sumB = getDigitSum(b)
        if (sumA != sumB) sumA < sumB
        else a < b
    }

    val visited = new Array[Boolean](n)
    var swaps = 0

    for (i <- 0 until n) {
      if (!visited(i) && indexedSeq(i)._2 != i) {
        var cycleSize = 0
        var curr = i

        while (!visited(curr)) {
          visited(curr) = true
          curr = indexedSeq(curr)._2
          cycleSize += 1
        }

        if (cycleSize > 1) {
          swaps += (cycleSize - 1)
        }
      }
    }
    swaps
  }


  private def getDigitSum(n: Int): Int = {
    var sum = 0
    var tmp = n
    while (tmp > 0) {
      sum += tmp % 10
      tmp /= 10
    }
    sum
  }
}
