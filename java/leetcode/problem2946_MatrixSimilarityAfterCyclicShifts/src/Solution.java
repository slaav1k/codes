class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for (int i = 0; i < mat.length; i++) {
            if (i % 2 == 0) {
                if (this.isSameAfterShift(mat[i], k, 1)) {
                    return false;
                };
            } else {
                if (this.isSameAfterShift(mat[i], k, -1)) {
                    return false;
                };
            }
        }
        return true;
    }

    private boolean isSameAfterShift(int[] matI, int k, int l) {
        int n = matI.length;
        k = k % n;
        for (int i = 0; i < n; i++) {
            if (l == 1) {
               if (matI[i] != matI[(i + k) % n]) {
                   return true;
               }
            } else {
                if (matI[i] != matI[(i - k % n + n) % n]) {
                    return true;
                }
            }
        }
        return false;
    }
}