import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<String> jewelSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            jewelSet.add(String.valueOf(c));
        }
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewelSet.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        int count = 0;
        for (Character c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}