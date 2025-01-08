public class Main {
    public static void main(String[] args) {
        System.out.println(countPrefixSuffixPairs(new String[] {"a", "aba", "ababa", "aa"}));
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int result = 0;
        int n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String word1 = words[i];
                String word2 = words[j];
                if (word2.startsWith(word1) && word2.endsWith(word1)) {
                    result++;
                }
            }
        }
        return result;
    }
}