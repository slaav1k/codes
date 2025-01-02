import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(vowelStrings(new String[]{"aba", "bcb", "ece", "aa", "e"}, new int[][]{{0, 2}, {1, 4}, {1, 1}})));
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefix = new int[words.length + 1];
        String vowel = "aeiou";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String f = word.charAt(0) + "";
            String l = word.charAt(word.length() - 1) + "";
            if (vowel.contains(f) && vowel.contains(l)) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0], ri = queries[i][1];
            res[i] = prefix[ri + 1] - prefix[li];
        }
        return res;
    }
}