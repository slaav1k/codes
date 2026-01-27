public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minCost(
                4,
                new int[][]{
                        {0, 1, 3}, {3, 1, 1}, {2, 3, 4}, {0, 2, 2}
                }
        ));
        System.out.println(s.minCost(
                4,
                new int[][]{
                        {0, 2, 1}, {2, 1, 1}, {1, 3, 1}, {2, 3, 3}
                }
        ));
    }
}