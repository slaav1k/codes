//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.largestTriangleArea(new int[][] {{0,0}, {0,1}, {1,0}, {0,2}, {2,0}}));
        System.out.println(s.largestTriangleArea(new int[][] {{1,0}, {0,0}, {0,1}}));
    }
}