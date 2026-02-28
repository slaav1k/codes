class Solution {
    public int concatenatedBinary(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(Integer.toBinaryString(i));
        }

        long res = 0;
        int MOD = 1000000007;
        String bs = sb.toString();

        for (int i = 0; i < bs.length(); i++) {
            int curr = bs.charAt(i) - '0';
            res = (res * 2 + curr) % MOD;
        }

        return (int) res;
    }
}