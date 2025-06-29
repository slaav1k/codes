import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
    List<List<Integer>> res = new ArrayList<>();
    int n = s.length();
    int tmpLen = 1;
    char previousChar = s.charAt(0);
    for (int i = 1; i < n; i++) {
        if (previousChar == s.charAt(i)) {
            tmpLen++;
        } else {
            if (tmpLen > 2) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(i - tmpLen);
                tmp.add(i - 1);
                res.add(tmp);
            }
            tmpLen = 1;
            previousChar = s.charAt(i);
        }
    }
    if (tmpLen > 2) {
        List<Integer> tmp = new ArrayList<>();
        tmp.add(n - tmpLen);
        tmp.add(n - 1);
        res.add(tmp);
    }
    return res;
    }
}