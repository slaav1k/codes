import java.util.regex.Pattern;

class Solution {
    public boolean detectCapitalUse(String word) {
        String tmp = word.toUpperCase();
        if (tmp.equals(word)) {
            return true;
        }

        tmp = word.toLowerCase();
        if (tmp.equals(word)) {
            return true;
        }

        Pattern p = Pattern.compile("^[A-Z][^A-Z]*$");
        return p.matcher(word).matches();
    }
}