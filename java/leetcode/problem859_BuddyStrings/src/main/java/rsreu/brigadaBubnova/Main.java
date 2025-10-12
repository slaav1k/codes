package rsreu.brigadaBubnova;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.buddyStrings("ab", "ba"));
        System.out.println(sol.buddyStrings("ab", "ab"));
        System.out.println(sol.buddyStrings("aa", "aa"));
    }
}