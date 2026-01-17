import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        collectLeaves(root1, list1);
        collectLeaves(root2, list2);
        return list1.equals(list2);
    }

    private void collectLeaves(TreeNode node, List<Integer> leaves){
        if(node == null) return;

        if(node.left == null && node.right == null){
            leaves.add(node.val);
            return;
        }

        collectLeaves(node.left, leaves);
        collectLeaves(node.right, leaves);
    }
}