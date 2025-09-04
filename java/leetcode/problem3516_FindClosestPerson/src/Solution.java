class Solution {
    public int findClosest(int x, int y, int z) {
        int n1 = Math.abs(x - z);
        int n2 = Math.abs(y - z);
        if (n1 == n2) return 0;
        return n1 > n2 ? 2 : 1;
    }
}