//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if (n < 0) return false;
        if (n % 4 != 0) return false;
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }
}