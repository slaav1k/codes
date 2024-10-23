import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        System.out.println(binaryTreePaths(root));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) helper(root, "", paths);
        return paths;
    }

    private static void helper(TreeNode root, String path, List<String> paths) {
        if (root.left == null && root.right == null) {paths.add(path + root.val);}
        if (root.left != null) {helper(root.left, path + root.val + "->", paths);}
        if (root.right != null) {helper(root.right, path + root.val + "->", paths);}
    }
}


