class Solution {
    public int totalWaviness(int num1, int num2) {
        int res = 0;
        for (int i = num1; i <= num2; i++) {
            res += isWaviness(numToArr(i));
        }
        return res;
    }

    private int isWaviness(int[] pNumArr) {
        int len = pNumArr.length;
        if (len < 3) {
            return 0;
        }

        int res = 0;
        for (int i = 1; i < len - 1; i++) {
            if ((pNumArr[i] > pNumArr[i - 1] && pNumArr[i] > pNumArr[i + 1]) ||
                    (pNumArr[i] < pNumArr[i - 1] && pNumArr[i] < pNumArr[i + 1])) {
                res++;
            }
        }

        return res;


    }


    private int[] numToArr(int pNum) {
        int len = (int) Math.log10(pNum) + 1;
        int[] numArr = new int[len];
        int i = 0;
        while (pNum > 0) {
            numArr[i++] = pNum % 10;
            pNum /= 10;
        }
        return numArr;
    }
}