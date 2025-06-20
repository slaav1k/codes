class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int count_strings = 0;
        int len = 0;
        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];
            int tmp_len = len + width;
            if (tmp_len > 100) {
                count_strings += 1;
                len = width;
            } else {
                len = tmp_len;
            }
        }
        return new int[]{count_strings + 1, len};
    }
}