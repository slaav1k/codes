class Solution {
    public int minOperations(String s) {
        int n = s.length();

        int count0 = 0;
        for (int i = 0; i < n; i++) {
            char expected = (i % 2 == 0) ? '0' : '1';
            if (s.charAt(i) != expected) {
                count0++;
            }
        }

        int count1 = 0;
        for (int i = 0; i < n; i++) {
            char expected = (i % 2 == 0) ? '1' : '0';
            if (s.charAt(i) != expected) {
                count1++;
            }
        }

        return Math.min(count0, count1);
    }
}