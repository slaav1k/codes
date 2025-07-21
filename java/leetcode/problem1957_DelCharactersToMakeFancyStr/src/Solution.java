class Solution {
    public String makeFancyString(String s) {
        char prev = s.charAt(0);
        int count = 1;
        StringBuilder res = new StringBuilder();
        res.append(prev);
        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (prev == cur) {
                count++;
            } else {
                prev = cur;
                count = 1;
            }
            if (count < 3) {
                res.append(prev);
            }
        }
        return res.toString();
    }
}