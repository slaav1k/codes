public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumTeachings(2, new int[][]{{1}, {2}, {1,2}}, new int[][] {{1,1}, {1,3}, {2,3}}));
        System.out.println(solution.minimumTeachings(3, new int[][] {{2}, {1, 3}, {1, 2}}, new int[][] {{1, 4}, {1, 2}, {3, 4}, {2, 3}}));
    }
}