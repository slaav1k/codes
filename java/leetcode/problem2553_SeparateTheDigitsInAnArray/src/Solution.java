import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int num: nums) {
            res.addAll(sepDigit(num));
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    private ArrayList<Integer> sepDigit(int num) {
        ArrayList<Integer> res = new ArrayList<>();
        while (num > 0) {
            res.add(num % 10);
            num /= 10;
        }
        Collections.reverse(res);
        return res;

    }
}