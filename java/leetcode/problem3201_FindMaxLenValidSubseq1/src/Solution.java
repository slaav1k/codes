class Solution {
    public int maximumLength(int[] nums) {
        int oddCnt = 0, evenCnt = 0, cnt = 0;
        boolean flag = nums[0] % 2 == 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                if (!flag) {
                    flag = !flag;
                    cnt++;
                }
                evenCnt++;
            } else {
                if (flag) {
                    flag = !flag;
                    cnt++;
                }
                oddCnt++;
            }
        }
        return Math.max(cnt, Math.max(evenCnt, oddCnt));
    }
}