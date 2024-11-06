import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(canSortArray(new int[]{75,34,30}));
    }

    public static boolean canSortArray(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int[] sorted = Arrays.stream(nums).sorted().toArray();
        if (sorted == nums) return true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] >= nums[j]) {
                    continue;
                }
                else {
                    if (Integer.bitCount(nums[j + 1]) == Integer.bitCount(nums[j])) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                    } else
                        return false;
                }
            }
        }
        return true;

    }
}