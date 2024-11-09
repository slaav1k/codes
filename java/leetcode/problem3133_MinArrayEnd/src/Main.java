//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(minEnd(3, 4));
    }


    public static long minEnd(int n, int x) {
        long res = x;
        long mask = 1;
        n -= 1;

        while (n > 0) {
            if ((mask & x) == 0) {
                res |= (n & 1) * mask;
                n >>= 1;
            }
            mask <<= 1;
        }

        return res;
    }
}