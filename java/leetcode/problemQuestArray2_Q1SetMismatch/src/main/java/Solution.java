class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int n = nums.length;
        int[] counts = new  int[n + 1];

        for (int num: nums) {
            counts[num]++;
        }

        for (int i = 1; i < counts.length; i++) {
            if (counts[i] == 0) {
                res[1] = i;
            }
            if (counts[i] == 2) {
                res[0] = i;
            }
        }

        return res;
    }
}