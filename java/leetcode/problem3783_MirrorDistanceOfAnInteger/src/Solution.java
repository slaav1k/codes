class Solution {
    public int mirrorDistance(int n) {
        if (n < 10) {
            return 0;
        }

        int reversed = 0;
        int temp = n;
        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }

        return Math.abs(reversed - n);
    }
}