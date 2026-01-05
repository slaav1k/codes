class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n  = matrix.length;
        long totalSum = 0;
        int countNegatives = 0;
        boolean hasZero = false;

        int el = 0;
        int minVal = Integer.MAX_VALUE;

        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                el = ints[j];
                if (el <= 0) {
                    countNegatives++;
                }
                if (el == 0) {
                    hasZero = true;
                }
                el = Math.abs(el);
                totalSum += el;

                minVal = Math.min(minVal, el);
            }
        }

        if  (countNegatives % 2 == 0 || hasZero) {
            return totalSum;
        } else  {
            return totalSum - minVal - minVal;
        }
    }
}