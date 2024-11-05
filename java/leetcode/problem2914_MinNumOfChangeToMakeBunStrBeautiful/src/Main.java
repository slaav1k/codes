//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(minChanges("1001"));
    }

    public static int minChanges(String s) {
        int k = 0;
        for (int i = 0; i < s.length(); i = i + 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                k++;
            }
        }
        return k;
    }
}