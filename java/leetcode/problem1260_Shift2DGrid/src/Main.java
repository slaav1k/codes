public class Main {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Solution.shiftGrid(grid, 1));
        System.out.println(Solution.shiftGrid(grid, 9));
    }
}