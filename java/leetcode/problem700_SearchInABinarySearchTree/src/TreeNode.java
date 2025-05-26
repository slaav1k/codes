public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(val);
        if (left != null) {
            sb.append("->");
            sb.append(left.toString());
        }
        if (right != null) {
            sb.append("->");
            sb.append(right.toString());
        }
        return sb.toString();
    }
}