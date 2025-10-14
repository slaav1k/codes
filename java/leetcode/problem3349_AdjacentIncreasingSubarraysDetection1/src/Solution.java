import java.util.List;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (nums == null || nums.size() < k || k <= 0) {
            return false;
        }

        int countIncreasing = 0;

        for (int i = 0; i <= nums.size() - k; i++) {
            if (isIncreasing(nums, i, i + k)) {
                countIncreasing++;
                if (countIncreasing >= 2) {
                    return true;
                }
            }
        }
        return false;
    }


    private boolean isIncreasing(List<Integer> nums, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}