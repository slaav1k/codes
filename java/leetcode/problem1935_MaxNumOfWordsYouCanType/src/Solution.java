class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        boolean flag;
        for (String word : words) {
            flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (brokenLetters.contains(word.substring(i, i + 1))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}