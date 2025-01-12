//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(diameterOfBinaryTree(root));
    }

    static int diameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        height(root);
        return diameter;
    }

    public static int height(TreeNode root) {
        if (root == null) return -1;
        int l = height(root.left);
        int r = height(root.right);
        diameter = Math.max(diameter, l + r + 2);
        return Math.max(l, r) + 1;
    }

}

