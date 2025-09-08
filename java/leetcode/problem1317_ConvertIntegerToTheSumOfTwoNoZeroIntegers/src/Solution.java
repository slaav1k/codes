class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i <= n; i++) {
            int a = i;
            int b = n - i;
            if (!checkNumForContainZeros(a) && !checkNumForContainZeros(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{};
    }

    private boolean checkNumForContainZeros(int n) {
        return String.valueOf(n).contains("0");
    }
}