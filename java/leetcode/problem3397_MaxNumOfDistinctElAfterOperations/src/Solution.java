import java.util.Arrays;

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int prev = Integer.MIN_VALUE;

        for (int curr : nums) {
            int minCurr = curr - k;
            int nextVal = Math.max(minCurr, prev + 1);
            int maxCurr = curr + k;

            if (nextVal <= maxCurr) {
                count++;
                prev = nextVal;
            }
        }

        return count;
    }
}