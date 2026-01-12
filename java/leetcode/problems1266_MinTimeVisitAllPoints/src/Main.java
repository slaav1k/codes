public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.minTimeToVisitAllPoints(
                new int[][]{
                        {1, 1},
                        {3, 4},
                        {-1, 0}
                }
        ));
        System.out.println(sol.minTimeToVisitAllPoints(
                new int[][]{
                        {3, 2},
                        {-2, 2},
                }
        ));
    }
}