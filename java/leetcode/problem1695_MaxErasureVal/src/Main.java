//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumUniqueSubarray(new int[]{4,2,4,5,6}));
        System.out.println(solution.maximumUniqueSubarray(new int[]{5,2,1,2,5,2,1,2,5}));
    }
}