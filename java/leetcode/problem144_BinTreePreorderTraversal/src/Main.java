import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(preorderTraversal(root));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        return inorderTraversal(root, res);
    }

    public static List<Integer> inorderTraversal(TreeNode root, List<Integer> inorder) {
        if (root == null) return inorder;
        inorder.add(root.val);
        inorderTraversal(root.left, inorder);
        inorderTraversal(root.right, inorder);
        return inorder;
    }

}

