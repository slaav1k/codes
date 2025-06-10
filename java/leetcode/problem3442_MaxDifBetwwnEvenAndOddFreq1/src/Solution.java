import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = this.getTableOfFreq(s);
        int max_odd = Integer.MIN_VALUE, max_even = Integer.MIN_VALUE;
        int min_odd = Integer.MAX_VALUE, min_even = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if (this.isEven(freq)) {
                if (freq > max_even) {
                    max_even = freq;
                }
                if (freq < min_even) {
                    min_even = freq;
                }
            } else {
                if (freq > max_odd) {
                    max_odd = freq;
                }
                if (freq < min_odd) {
                    min_odd = freq;
                }
            }
        }
        int a = max_odd - min_even;
        int b = min_odd - max_even;
        return Math.max(a, b);
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }

    private Map<Character, Integer> getTableOfFreq(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        return map;
    }
}