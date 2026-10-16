package problem0897_IncreasingOrderSearchTree

object Runner {
  def main(array: Array[String]): Unit = {
    var sample = new TreeNode(5)
    sample.left = new TreeNode(3)
    sample.left.right = new TreeNode(2)
    sample.left.right.right = new TreeNode(1)
    sample.right = new TreeNode(6)
    sample.right.right = new TreeNode(8)
    sample.right.right.left = new TreeNode(7)
    sample.right.right.right = new TreeNode(9)

    println(Solution.increasingBST(sample))

  }
}
