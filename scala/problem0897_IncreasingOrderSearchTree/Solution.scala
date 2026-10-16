package problem0897_IncreasingOrderSearchTree

object Solution {
  def increasingBST(root: TreeNode): TreeNode = {
    val res = new TreeNode(0)
    var cur = res
    
    def loop(node: TreeNode): Unit = {
      if (node == null) return 
      
      loop(node.left)
      
      node.left = null
      cur.right = node
      cur = node
      
      loop(node.right)
    }
    
    loop(root)
    res.right
  }
}
