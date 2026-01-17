public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.largestSquareArea(
                new int[][] {
                        {1, 1},
                        {2, 2},
                        {3, 1}
                },
                new int[][] {
                        {3, 3},
                        {4, 4},
                        {6, 6}
                }
        ));
    }
}