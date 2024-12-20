//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(13);
        root.right.left = new TreeNode(21);
        root.right.right = new TreeNode(34);
        System.out.println(reverseOddLevels(root));
    }

    public static TreeNode reverseOddLevels(TreeNode root) {
        reverse(root.left, root.right, 0);
        return root;
    }

    private static void reverse(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) {
            return;
        }
        if (level % 2 == 0) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        reverse(left.left, right.right, level + 1);
        reverse(left.right, right.left, level + 1);
    }
}

