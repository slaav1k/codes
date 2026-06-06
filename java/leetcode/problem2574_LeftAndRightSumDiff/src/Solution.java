import java.util.Arrays;

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            res[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }

        return res;
    }
    public int[] leftRightDifference2(int[] nums) {
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];
        int[] res = new int[n];
        int sum = Arrays.stream(nums).sum();
        int tmp = 0;


        for (int i = 0; i < n; i++) {
            l[i] = tmp;
            tmp += nums[i];
            r[i] = sum - tmp;
            res[i] = Math.abs(l[i] - r[i]);
        }

        return res;
    }
}