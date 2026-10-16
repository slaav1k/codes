package problem0897_IncreasingOrderSearchTree

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right

  override def toString: String = {
    val lStr = if (left != null) left.toString else "null"
    val rStr = if (right != null) right.toString else "null"
    s"Node($value, $lStr, $rStr)"
  }
}
