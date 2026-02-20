class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];
        int a, b;
        boolean f;


        for (int i = 0; i < n; i++) {
            a = prices[i];
            f = false;
            for (int j = i + 1; j < n; j++) {
                b = prices[j];
                if (b <= a) {
                    res[i] = a - b;
                    f = true;
                    break;
                }
            }
            if (!f) {
                res[i] = a;
            }
        }

        return res;
    }
}