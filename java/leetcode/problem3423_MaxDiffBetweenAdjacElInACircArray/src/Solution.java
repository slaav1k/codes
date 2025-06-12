class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Integer.MIN_VALUE;
        int diff = 0;
        for (int i = 1; i < nums.length; i++) {
            diff = Math.abs(nums[i] - nums[i - 1]);
            if (diff > max) {
                max = diff;
            }
        }
        diff = Math.abs(nums[0] - nums[nums.length - 1]);
        return Math.max(max, diff);
    }
}