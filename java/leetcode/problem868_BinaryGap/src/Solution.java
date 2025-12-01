class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int res = 0;
        int prevIndex = -1;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (i != 0) {
                    res =  Math.max(res, i - prevIndex);
                }
                prevIndex = i;
            }
        }
        return res;
    }
}