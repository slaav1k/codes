//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.partitionArray(new int[]{3, 6, 1, 2, 5}, 2));
        System.out.println(solution.partitionArray(new int[]{1, 2, 3}, 1));
        System.out.println(solution.partitionArray(new int[]{2, 2, 4, 5}, 0));
    }
}