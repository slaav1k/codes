class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        int digits = 0;
        int vowels = 0;
        int consonants = 0;

        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                digits++;
            } else if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                return false;
            }
        }

        return vowels > 0 && consonants > 0;
    }
}
