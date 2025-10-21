import java.util.HashMap;

class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int n = nums.length;
        int ans = 0;
        int left = 0;
        int right = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            while (num - nums[left] > k) {
                left = left + 1;
            }
            while (right < n - 1 && nums[right + 1] - num <= k) {
                right = right + 1;
            }

            int total = right - left + 1;
            ans = Math.max(ans, Math.min(total - map.get(num), numOperations) + map.get(num));
        }

        left = 0;
        for (right = 0; right < n; right++) {
            int mid = (nums[right] + nums[left]) / 2;

            while (mid - nums[left] > k || nums[right] - mid > k) {
                left = left + 1;
                mid = (nums[right] + nums[left]) / 2;
            }
            ans = Math.max(ans, Math.min(right - left + 1, numOperations));
        }
        return ans;
    }
}