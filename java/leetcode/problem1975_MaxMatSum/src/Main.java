public class Main {
    public static void main(String[] args) {
        System.out.println(maxMatrixSum(new int[][]{new int[]{1, -1}, new int[]{-1, 1}}));
    }

    public static long maxMatrixSum(int[][] matrix) {
        long total = 0;
        int countNeg = 0;
        long minAbs = Long.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total += Math.abs(matrix[i][j]);
                if (Math.abs(matrix[i][j]) < minAbs) {
                    minAbs = Math.abs(matrix[i][j]);
                }
                if (matrix[i][j] < 0) {
                    countNeg++;
                }
            }
        }

        if (countNeg % 2 != 0) {
            total -= 2 * minAbs;
        }

        return total;
    }
}