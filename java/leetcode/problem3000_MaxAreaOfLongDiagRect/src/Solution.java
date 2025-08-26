class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;

        for (int[] d : dimensions) {
            int a = d[0];
            int b = d[1];
            double diagonal = Math.sqrt(a * a + b * b);
            int area = a * b;

            if (diagonal > maxDiagonal || (diagonal == maxDiagonal && area > maxArea)) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
        }

        return maxArea;
    }
}
