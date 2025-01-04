//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
        if (num % 2 != 0) return false;
        int s = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) s += i;
            if (s > num) return false;
        }
        return s == num;
    }
}