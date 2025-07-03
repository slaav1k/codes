class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        while (sb.length() < k) {
            String s = generateStringFromNextCharacter(sb.toString());
            sb.append(s);
        }
        return sb.charAt(k - 1);
    }

    private String generateStringFromNextCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append((char) ('a' + (c - 'a' + 1) % 26));
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char) ('A' + (c - 'A' + 1) % 26));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}