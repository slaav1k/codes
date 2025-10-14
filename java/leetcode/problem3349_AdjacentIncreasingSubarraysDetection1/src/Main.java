import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> nums1 = Arrays.asList(2, 5, 7, 8, 9, 2, 3, 4, 3, 1);
        System.out.println(sol.hasIncreasingSubarrays(nums1, 3));
        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 4, 4, 4, 5, 6, 7);
        System.out.println(sol.hasIncreasingSubarrays(nums2, 5));
    }
}
