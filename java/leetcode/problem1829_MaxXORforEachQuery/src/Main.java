import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMaximumXor(new int[]{0, 1, 1, 3}, 2)));
    }


    public static int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] ^ nums[i];
        }
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = result[result.length - 1 - i] ^ ((1 << maximumBit) - 1);
        }
        return ans;
    }
}