import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFreqSum(String s) {
        String vowels = "aeiouAEIOU";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int maxVowel = 0;
        int maxConsonant = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (vowels.indexOf(c) != -1) {
                maxVowel = Math.max(maxVowel, count);
            } else {
                maxConsonant = Math.max(maxConsonant, count);
            }
        }

        return maxVowel + maxConsonant;

    }
}