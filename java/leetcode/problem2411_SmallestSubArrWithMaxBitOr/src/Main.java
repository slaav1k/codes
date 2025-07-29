import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.smallestSubarrays(new int[]{1, 0, 2, 1, 3})));
        System.out.println(Arrays.toString(solution.smallestSubarrays(new int[]{1, 2})));
    }
}