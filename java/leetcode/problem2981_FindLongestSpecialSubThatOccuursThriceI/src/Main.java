import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        System.out.println(maximumLength("aaaa"));
        System.out.println(maximumLength("abcdef"));
        System.out.println(maximumLength("abcaba"));
    }

    public static int maximumLength(String s) {
        int n = s.length();
        int maxLength = -1;

        for (int len = 1; len <= n; len++) {
            Map<String, Integer> substringCount = new HashMap<>();
            for (int i = 0; i <= n - len; i++) {
                String substring = s.substring(i, i + len);
                if (isSpecial(substring)) {
                    substringCount.put(substring, substringCount.getOrDefault(substring, 0) + 1);
                }
            }

            for (Map.Entry<String, Integer> entry : substringCount.entrySet()) {
                if (entry.getValue() >= 3) {
                    maxLength = len;
                }
            }
        }

        return maxLength;
    }

    private static boolean isSpecial(String s) {
        char firstChar = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c != firstChar) {
                return false;
            }
        }
        return true;
    }

}