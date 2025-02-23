import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(factorial(k + n - 1) / (factorial(k) * (factorial(n - 1))));
    }

    private static int factorial(int parN) {
        int res = 1;
        for (int i = 1; i <= parN; i++) {
            res *= i;
        }
        return res;
    }
}