import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n+1];
        List<Integer> res = new ArrayList<>();

        for (int num: nums) {
            counts[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (counts[i] == 0) {
                res.add(i);
            }
        }

        return res;
    }
}