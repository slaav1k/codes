//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"}));
        System.out.println(solution.mostCommonWord("a.", new String[] {}));
    }
}