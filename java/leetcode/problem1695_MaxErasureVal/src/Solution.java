import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int left = 0, right = 0;
        int score = 0, maxScore = 0;

        while (right < nums.length) {
            if (!seen.contains(nums[right])) {
                score += nums[right];
                seen.add(nums[right]);
                maxScore = Math.max(maxScore, score);
                right++;
            } else {
                score -= nums[left];
                seen.remove(nums[left]);
                left++;
            }
        }

        return maxScore;
    }
}
