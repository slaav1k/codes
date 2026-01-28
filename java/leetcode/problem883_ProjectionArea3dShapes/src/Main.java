public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.projectionArea(
                new int[][]{
                        {1, 2},
                        {3, 4}
                }
        ));

        System.out.println(s.projectionArea(
                new int[][]{
                        {2}
                }
        ));

        System.out.println(s.projectionArea(
                new int[][]{
                        {1, 0},
                        {0, 2}
                }
        ));
    }
}