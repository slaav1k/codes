import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int num : arr) {
            int bits = Integer.bitCount(num);
            map.computeIfAbsent(bits, k -> new ArrayList<>()).add(num);
        }

        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .flatMap(e -> e.getValue().stream().sorted())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}