class Solution {
    public int smallestNumber(int n) {
        String binary = Integer.toBinaryString(n);
        while (!checkAllSetBits(binary)) {
            binary = Integer.toBinaryString(++n);
        }
        return n;
    }

    private boolean checkAllSetBits(String binary) {
        int countZeros = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                countZeros++;
            }
        }
        return countZeros == 0;
    }


}