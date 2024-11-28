//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(3));
    }

    public static int arrangeCoins(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int res = 1;
        n--;
        int k = 2;
        while (n - k >= 0) {
            n -= k++;
            res++;
        }
        return res;
    }
}