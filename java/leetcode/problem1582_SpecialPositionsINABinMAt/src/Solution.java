class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isSpecial(i, j, mat, n, m)) {
                    res++;
                }
            }
        }
        return res;
    }

    private boolean isSpecial(int pI, int pJ, int[][] mat, int n, int m) {
        for (int i = 0; i < m; i++) {
            if (i != pI && mat[i][pJ] == 1) {
                return false;
            }
        }
        for (int j = 0; j < n; j++) {
            if (j != pJ && mat[pI][j] == 1) {
                return false;
            }
        }

        return mat[pI][pJ] == 1;

    }
}