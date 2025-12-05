//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countPartitions(new int[] {10, 10, 3, 7, 6}));
        System.out.println(sol.countPartitions(new int[] {2, 4, 6, 8}));
        System.out.println(sol.countPartitions(new int[] {1, 2, 2}));
    }
}