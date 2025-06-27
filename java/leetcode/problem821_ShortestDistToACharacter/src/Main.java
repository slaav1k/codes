import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(solution.shortestToChar("aaab", 'b')));

    }
}