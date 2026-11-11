package problem0917_ReverseOnlyLetters

object Solution {
  def reverseOnlyLetters(s: String): String = {
    val arr = s.toCharArray
    var l = 0
    var r = arr.length - 1
    var tmp = 'a'
    
    while (l < r) {
      if (isNotLetter(arr(l))) {
        l += 1
      } else if (isNotLetter(arr(r))) {
        r -= 1
      } else {
        tmp = arr(l)
        arr(l) = arr(r)
        arr(r) = tmp
        l += 1
        r -= 1
      }
    }
    
    new String(arr)
  }
  
  private def isNotLetter(char: Char): Boolean = {
    !char.isLetter
  }
}
