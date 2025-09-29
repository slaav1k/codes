//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minScoreTriangulation(new int[]{1, 2, 3}));
        System.out.println(solution.minScoreTriangulation(new int[]{3, 7, 4, 5}));
        System.out.println(solution.minScoreTriangulation(new int[]{1, 3, 1, 4, 1, 5}));
    }
}