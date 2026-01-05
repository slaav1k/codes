public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxMatrixSum(new int[][]{
                {1, -1},
                {-1, 1}
        }));
        System.out.println(solution.maxMatrixSum(new int[][]{
                {1, 2, 3},
                {-1, -2, -3},
                {1, 2, 3}
        }));
        System.out.println(solution.maxMatrixSum(new int[][]{
                {-1, 0, -1},
                {-2, 1, 3},
                {3, 2, 2}
        }));
    }
}