class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i - 1) - '0';
                int mod = (a + b) % 10;
                sb.append(mod);
            }
            s = sb.toString();
        }
        return s.contentEquals(new StringBuilder(s).reverse());
    }
}