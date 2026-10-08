package problem1021

object Solution {
  def removeOuterParentheses(s: String): String = {
    var res = ""
    var counter = 0
    
    for (skobka <- s) {
      if (skobka == '(' && counter == 0) counter += 1
      else if (skobka == '(' && counter > 0) {
        counter += 1
        res += skobka.toString
      }
      else if (skobka == ')' && counter > 1) {
        counter -= 1
        res += skobka.toString
      }
      else counter -= 1
    }
    
    res
  }

  def removeOuterParenthesesOptimum(s: String): String = {
    val sb = new StringBuilder
    var counter = 0

    for (c <- s) {
      if (c == '(') {
        if (counter > 0) sb.append(c) 
        counter += 1
      } else { // c == ')'
        counter -= 1
        if (counter > 0) sb.append(c)
      }
    }

    sb.toString
  }
}