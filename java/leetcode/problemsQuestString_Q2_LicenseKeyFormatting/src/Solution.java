class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        s = s.toUpperCase();
        int n = s.length();
        int count = 0;
        char tmp;

        for (int i = n - 1; i >= 0; i--) {
            tmp = s.charAt(i);
            if (tmp != '-') {
               sb.append(tmp);
               count++;
               if (count == k && i != 0) {
                   sb.append('-');
                   count = 0;
               }
            }
        }

        String result = sb.reverse().toString();
        if (result.startsWith("-")) {
            result = result.substring(1);
        }

        return result;
    }
}