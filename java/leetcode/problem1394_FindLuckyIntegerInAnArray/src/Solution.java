import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        int max = -1;
        int tmpValue = 0;
        for (Integer key : map.keySet()) {
            tmpValue = map.get(key);
            if (tmpValue == key && max < tmpValue) {
                max = tmpValue;
            }
        }
        return max;
    }
}