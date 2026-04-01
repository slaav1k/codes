class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() <= 1) {
            return false;
        }

        String t = s + s;
        return t.substring(1, t.length() - 1).contains(s);
    }
}