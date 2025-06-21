import java.util.Arrays;

class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = this.countFreq(word);
        Arrays.sort(freq);

        int res = Integer.MAX_VALUE;
        int deletedTillNow = 0;

        for (int i = 0; i < 26; i++) {
            int minFreq = freq[i];
            int temp = deletedTillNow;

            for(int j = 25; j > i; j--) {
                if (freq[j] - freq[i] <= k)
                    break;

                temp += freq[j] - minFreq - k;
            }
            res = Math.min(res, temp);
            deletedTillNow += minFreq;
        }
        return res;
    }

    private int[] countFreq(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
}