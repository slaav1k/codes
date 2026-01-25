import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - k + 1; ++i) {
            minDiff = Math.min(minDiff, Math.abs(nums[i + k - 1] - nums[i]));
        }
        return minDiff;
    }
}