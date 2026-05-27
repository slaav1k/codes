package slaav1k;


import java.util.Arrays;

class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];

        Arrays.fill(lastLower, -1);
        Arrays.fill(firstUpper, Integer.MAX_VALUE);

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) {
                int idx = c - 'a';
                lastLower[idx] = i;
            } else {
                int idx = c - 'A';
                firstUpper[idx] = Math.min(firstUpper[idx], i);
            }
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lastLower[i] != -1 && firstUpper[i] != Integer.MAX_VALUE) {
                if (lastLower[i] < firstUpper[i]) {
                    count++;
                }
            }
        }

        return count;
    }
}