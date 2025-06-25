import java.util.HashMap;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[!?',;\\.]", " ");
        String[] words = paragraph.split("\\s+");
        for (String word : words) {
            if (!isInBanned(word, banned)) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                }
                else {
                    map.put(word, 1);
                }
            }
        }
        int max = 0;
        String maxWord = "";
        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                maxWord = word;
            }
        }
        return maxWord;
    }

    private boolean isInBanned(String word, String[] words) {
        for (String s : words) {
            if (s.equals(word)) {
                return true;
            }
        }
        return false;
    }
}