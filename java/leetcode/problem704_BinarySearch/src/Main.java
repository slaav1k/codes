public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(solution.search(nums, target));
        nums = new int[]{-1,0,3,5,9,12};
        target = 2;
        System.out.println(solution.search(nums, target));
    }
}