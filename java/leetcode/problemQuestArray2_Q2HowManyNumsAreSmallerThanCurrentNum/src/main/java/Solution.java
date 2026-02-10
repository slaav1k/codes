import java.sql.Array;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int tmp;

        for (int i = 0; i < n; i++) {
            tmp = 0;
            for (int num: nums) {
                if (num < nums[i]) {
                    tmp++;
                }
            }
            res[i] = tmp;
        }

        return res;
    }
}