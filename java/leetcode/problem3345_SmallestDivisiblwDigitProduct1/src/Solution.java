class Solution {
    public int smallestNumber(int n, int t) {
        while (digitProduct(n) % t != 0) {
            n++;
        }
        return n;
    }

    private int digitProduct(int n) {
        if (n == 0) return 0;
        int prod = 1;
        while (n > 0) {
            int digit = n % 10;
            prod *= digit;
            if (prod == 0) return 0;
            n /= 10;
        }
        return prod;
    }
}