import java.util.Collections;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(repeatLimitedString("cczazcc", 3));
        System.out.println(repeatLimitedString("aababab", 2));
    }

    public static String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder sb = new StringBuilder();
        TreeMap<Character, Integer> frequencyMap = new TreeMap<>(Collections.reverseOrder());
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        while (!frequencyMap.isEmpty()) {
            char ch = frequencyMap.firstKey();
            int count = frequencyMap.get(ch);

            if (!sb.isEmpty() && ch == sb.charAt(sb.length() - 1)) {
                break;
            }

            int useCount = Math.min(count, repeatLimit);
            sb.append(String.valueOf(ch).repeat(useCount));

            if (count > useCount) {
                frequencyMap.put(ch, count - useCount);
            } else {
                frequencyMap.remove(ch);
            }

            if (count > useCount && frequencyMap.size() > 1) {
                char nextCh = frequencyMap.higherKey(ch);
                sb.append(nextCh);
                int nextCount = frequencyMap.get(nextCh);
                if (nextCount == 1) {
                    frequencyMap.remove(nextCh);
                } else {
                    frequencyMap.put(nextCh, nextCount - 1);
                }
            }

        }
        return sb.toString();
    }
}