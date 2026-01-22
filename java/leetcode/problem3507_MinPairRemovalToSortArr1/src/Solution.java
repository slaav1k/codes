class Solution {
    public int minimumPairRemoval(int[] nums) {
        int a, b, sum;
        int[] tmp;
        int count = 0;
        while (!isArrNonDecreasing(nums)) {
            count++;
            nums = replaceTwoWithSum(nums, findPairWithMinSum(nums));
        }
        return count;

    }

    private int[] replaceTwoWithSum(int[] nums, int[] indexes) {
        int[] res = new int[nums.length - 1];
        int a = indexes[0];
        int b = indexes[1];
        int sum = indexes[2];

        System.arraycopy(nums, 0, res, 0, a);

        res[a] = sum;

        System.arraycopy(nums, b + 1, res, a + 1, nums.length - (b + 1));

        return res;
    }

    private int[] findPairWithMinSum(int[] nums) {
        int a = 0, b = 1;
        int minSum = nums[a] + nums[b];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + nums[i + 1] < minSum) {
                a = i;
                b = i + 1;
                minSum = nums[i] + nums[i + 1];
            }
        }
        return new int[]{a, b, minSum};
    }

    private boolean isArrNonDecreasing(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}