//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumDeletions("aabcaba", 0));
        System.out.println(solution.minimumDeletions("dabdcbdcdcd", 2));
        System.out.println(solution.minimumDeletions("aaabaaa", 2));
    }
}