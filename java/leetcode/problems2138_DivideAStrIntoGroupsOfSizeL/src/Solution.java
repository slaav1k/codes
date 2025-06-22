import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int words = n / k;
        boolean flag = false;
        int countFill = 0;
        if (words * k != n) {
            words += 1;
            countFill = (words * k) - n;
            s = s + String.valueOf(fill).repeat(countFill);
        }
        String[] res = new String[words];
        for (int i = 0; i < words; i++) {
            res[i] = s.substring(k * i, k * i + k);
        }
        return res;
    }
}