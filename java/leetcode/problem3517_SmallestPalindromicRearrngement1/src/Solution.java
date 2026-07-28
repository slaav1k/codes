import java.util.TreeMap;

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if (n == 1) {
            return s;
        }

        char mid = ' ';

        StringBuilder res = new StringBuilder();

        TreeMap<Character, Integer> map = new TreeMap<>();

        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int tmpLen;

        for (char c: map.keySet()) {
            tmpLen = map.get(c);
            res.append(String.valueOf(c).repeat(tmpLen / 2));
            if (tmpLen % 2 != 0) {
                mid = c;
            }
        }

        StringBuilder res2 = new StringBuilder(res).reverse();

        if (mid != ' ') {
            res.append(mid);
        }

        return res.append(res2).toString();


    }
}