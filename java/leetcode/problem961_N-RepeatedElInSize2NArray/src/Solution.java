import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }  else {
                map.put(num, 1);
            }
        }
        int n =  nums.length / 2;
        for(int key : map.keySet()) {
            if (map.get(key) == n)
                return key;
        }
        return -1;
    }

    public int repeatedNTimes2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}