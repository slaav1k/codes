package problem0922_SortArrayByParity2

object Solution {
  def sortArrayByParityII(nums: Array[Int]): Array[Int] = {
    var even = 0
    var odd = 1
    val n = nums.length

    while (even < n && odd < n) {
      while (even < n && nums(even) % 2 == 0) {
        even += 2
      }
      while (odd < n && nums(odd) % 2 != 0) {
        odd += 2
      }
      
      if (even < n && odd < n) {
        val temp = nums(even)
        nums(even) = nums(odd)
        nums(odd) = temp
      }
    }

    nums
  }
}
