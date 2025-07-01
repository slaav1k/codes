class Solution {
    public int possibleStringCount(String word) {
        int count = 1;
        char[] chars = word.toCharArray();
        char prev = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prev) {
                count++;
            }
            prev = chars[i];
        }
        return count;
    }
}