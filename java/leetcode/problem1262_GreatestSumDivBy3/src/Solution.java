import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        List<Integer> remainder1 = new ArrayList<>();
        List<Integer> remainder2 = new ArrayList<>();

        for (int num : nums) {
            sum += num;
            if (num % 3 == 1) {
                remainder1.add(num);
            }
            if (num % 3 == 2) {
                remainder2.add(num);
            }
        }

        int mod = sum % 3;
        if (mod == 0) {
            return sum;
        } else {
            int res1 = 0, res2 = 0;
            Collections.sort(remainder1);
            Collections.sort(remainder2);
            if (mod == 1) {
                if (!remainder1.isEmpty()) {
                    res1 = sum - remainder1.getFirst();
                }
                if (remainder2.size() > 1) {
                    res2 = sum - remainder2.get(0) - remainder2.get(1);
                }
            } else {
                if (!remainder2.isEmpty()) {
                    res1 = sum - remainder2.getFirst();
                }
                if (remainder1.size() > 1) {
                    res2 = sum - remainder1.getFirst() - remainder1.get(1);
                }
            }
            return Math.max(res1, res2);
        }
    }
}