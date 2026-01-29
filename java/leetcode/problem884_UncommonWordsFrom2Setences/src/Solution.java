import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> count = new HashMap<>();

        for (String word : s1.split(" ")) {
            count.merge(word, 1, Integer::sum);
        }
        for (String word : s2.split(" ")) {
            count.merge(word, 1, Integer::sum);
        }

        // Собираем слова, которые встретились ровно 1 раз
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> e : count.entrySet()) {
            if (e.getValue() == 1) {
                result.add(e.getKey());
            }
        }

        return result.toArray(new String[0]);
    }
}