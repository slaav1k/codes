//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(maxWidthRamp(new int[]{6, 0, 8, 2, 1, 5}));
    }

    public static int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] <= nums[j]) {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }
}