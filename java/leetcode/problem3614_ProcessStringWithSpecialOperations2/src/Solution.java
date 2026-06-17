class Solution {
    public char processStr(String s, long k) {
        int n = s.length();

        long len = 0;
        for (char c : s.toCharArray()) {
            if (c == '*') {
                len = Math.max(len - 1, 0L);
            } else if (c == '#') {
                len *= 2;
            } else if (c != '%') {
                len++;
            }
        }

        if (k >= len) {
            return '.';
        }

        long curLen = len;
        long pos = k;

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '*') {
                curLen++;
            } else if (c == '#') {
                long half = curLen / 2;
                if (pos >= half) {
                    pos -= half;
                }
                curLen = half;
            } else if (c == '%') {
                pos = curLen - 1 - pos;
            } else {
                if (curLen == pos + 1) {
                    return c;
                }
                curLen--;
            }
        }

        return '.';
    }
}