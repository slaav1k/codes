class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int count = 0;
        int idx, idxReverse, product;
        for (char c : s.toCharArray()) {
            idx = ++count;
            idxReverse = 'z' - c + 1;
            product = idx * idxReverse;
            sum += product;
        }
        return sum;
    }
}