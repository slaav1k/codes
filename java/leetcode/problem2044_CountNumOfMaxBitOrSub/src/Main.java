public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countMaxOrSubsets(new int[] {3, 1}));
        System.out.println(solution.countMaxOrSubsets(new int[] {2, 2, 2, 2}));
        System.out.println(solution.countMaxOrSubsets(new int[] {1, 2, 1, 5}));
    }
}