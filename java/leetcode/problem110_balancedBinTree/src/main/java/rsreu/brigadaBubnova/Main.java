package rsreu.brigadaBubnova;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        Solution s = new Solution();

        System.out.println(s.isBalanced(treeNode));
    }
}