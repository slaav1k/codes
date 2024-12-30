public class Main {
    public static void main(String[] args) {
        System.out.println(countGoodStrings(3, 3,1, 1));
        System.out.println(countGoodStrings(2, 3,1, 2));
    }

    public static int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        dp[0] = 1;
        int mod = 1_000_000_007;
        int count = 0;

        for (int end = 1; end <= high; ++end) {
            if (end >= zero) {
                dp[end] += dp[end - zero];
            }
            if (end >= one) {
                dp[end] += dp[end - one];
            }
            dp[end] %= mod;
        }

        for (int i = low; i <= high; ++i) {
            count += dp[i];
            count %= mod;
        }
        return count;
    }
}
