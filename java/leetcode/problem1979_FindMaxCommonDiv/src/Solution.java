class Solution {
    public static int findGCD(int[] nums) {
        int min = findMin(nums);
        int max = findMax(nums);
        return gcd(max, min);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        return min;
    }

    private static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
}