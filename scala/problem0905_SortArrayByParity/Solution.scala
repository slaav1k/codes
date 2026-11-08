package problem0905_SortArrayByParity

object Solution {
  def sortArrayByParity(nums: Array[Int]): Array[Int] = {
    val n = nums.length
    var l = 0
    var r = n - 1
    var tmp = 0
    while (l < r) {
      while (l < r && isEven(nums(l))) l = l + 1
      while (l < r && !isEven(nums(r))) r = r - 1
      if (l < r && !isEven(nums(l)) & isEven(nums(r))) {
        tmp = nums(r)
        nums(r) = nums(l)
        nums(l) = tmp
      }
    }
    nums
  }

  def isEven(num: Int): Boolean = {
    num % 2 == 0
  }
}
