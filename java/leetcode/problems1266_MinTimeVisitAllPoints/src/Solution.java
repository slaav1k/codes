class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        int n = points.length;
        int[] prev_point = points[0];
        int[] point;
        int x, y;

        for (int i = 1; i < n; i++) {
            point = points[i];
            x = Math.abs(prev_point[0] - point[0]);
            y = Math.abs(prev_point[1] - point[1]);
            res += Math.max(x, y);
            prev_point = point;
        }

        return res;
    }
}