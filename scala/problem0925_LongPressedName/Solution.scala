package problem0925_LongPressedName

object Solution {
  def isLongPressedName(name: String, typed: String): Boolean = {
    var i = 0
    var j = 0

    val n = name.length
    val m = typed.length

    while (j < m) {
      if (i < n && name(i) == typed(j)) {
        i += 1
        j += 1
      } else if (j > 0 && typed(j) == typed(j - 1)) {
        j += 1
      } else {
        return false
      }
    }

    i == n
  }
}