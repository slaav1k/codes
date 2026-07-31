import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int minimumPushes(String word) {
        int result = 0;

        Map<Character, Integer> map = new HashMap<>();

        char[] wordChars = word.toCharArray();

        for (char el: wordChars) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());
        chars.sort(
                (a, b) -> map.get(b) - map.get(a)
        );

        Map<Character, Integer> pushes = new HashMap<>();

        for (int i = 0; i < chars.size(); i++) {
            pushes.put(chars.get(i), (i / 8) + 1);
        }

        for (char el: wordChars) {
            result += pushes.get(el);
        }

        return result;
    }
}