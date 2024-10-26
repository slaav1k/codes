import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9, 6, 7, 5, 4, 3, 2, 0, 1}));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if (n != nums[n - 1])
            return n;
        if (nums[0] != 0) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                return nums[i - 1] + 1;
            }
        }
        return -1;

    }
}