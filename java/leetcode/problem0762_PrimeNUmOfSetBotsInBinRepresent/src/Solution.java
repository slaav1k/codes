class Solution {
    public int countPrimeSetBits(int left, int right) {
        int countOnes = 0;

        for (int i = left; i <= right; i++) {
            if (isPrime(Integer.bitCount(i))) {
                countOnes++;
            }
        }
        return countOnes;
    }

    private boolean isPrime(int parNum) {
        if (parNum <= 1) return false;
        if (parNum <= 3) return true;
        if (parNum % 2 == 0 || parNum % 3 == 0) return false;

        for (int i = 5; i * i <= parNum; i += 6) {
            if (parNum % i == 0 || parNum % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}