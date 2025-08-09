object Solution {
  def isPowerOfTwo(n: Int): Boolean = {
    if (n < 1) return false
    if (n == 1 || n == 2) {
      return true
    }
    if (n % 2 != 0) {
      return false
    }
    var value = n
    while (value % 2 == 0 && value > 1) {
      value /= 2
    }
    value == 1
  }
}