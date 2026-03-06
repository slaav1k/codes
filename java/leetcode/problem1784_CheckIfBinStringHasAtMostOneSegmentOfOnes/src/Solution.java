class Solution {
    public boolean checkOnesSegment(String s) {
        boolean firstSegment = false, firstSegmentEnd = false;
        char tmp;

        for (int i = 0; i < s.length(); i++) {
            tmp = s.charAt(i);
            if (tmp == '0' && firstSegment) {
                firstSegmentEnd = true;
            }
            if (tmp == '1') {
                if (!firstSegment) {
                    firstSegment = true;
                } else if (firstSegmentEnd) {
                    return false;
                }
            }
        }

        return true;
    }
}