import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumSize(new int[] {9}, 2));
        System.out.println(minimumSize(new int[] {2, 4, 8, 2}, 4));
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        int low = 1, high = Arrays.stream(nums).max().getAsInt();
        while (low < high) {
            int mid = (low + high) / 2;
            int balls = 0;
            for (int n : nums) {
                balls += (n - 1) / mid;
            }
            if (balls <= maxOperations) high = mid;
            else low = mid + 1;
        }
        return high;
    }
}