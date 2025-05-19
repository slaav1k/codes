public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 3, 3};
        int[] nums2 = {2, 3, 3};
        int[] nums3 = {3, 4, 5};
        int[] nums4 = {10, 3, 4};
        System.out.println(solution.triangleType(nums));
        System.out.println(solution.triangleType(nums2));
        System.out.println(solution.triangleType(nums3));
        System.out.println(solution.triangleType(nums4));
    }
}