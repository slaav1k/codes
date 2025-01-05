//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
    }

    public static boolean detectCapitalUse(String word) {
        return (word.substring(0, 1).equals(word.substring(0, 1).toUpperCase()) && word.substring(1).equals(word.substring(1).toLowerCase()))
                || word.equals(word.toUpperCase())
                || word.equals(word.toLowerCase());
    }
}