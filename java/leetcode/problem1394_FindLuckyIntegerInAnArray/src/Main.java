//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findLucky(new int[]{2, 2, 3, 4}));
        System.out.println(solution.findLucky(new int[]{1, 2, 2, 3, 3, 3}));
        System.out.println(solution.findLucky(new int[]{2, 2, 2, 3, 3}));
    }
}