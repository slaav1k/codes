
public class Main {
    public static void main(String[] args) {
        System.out.println(canMakeSubsequence("abc", "ad"));
        System.out.println(canMakeSubsequence("zc", "ad"));
        System.out.println(canMakeSubsequence("ab", "d"));
    }

    public static boolean canMakeSubsequence(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }
        int sbIdx = 0;
        int sbLen = str2.length();

        for (char c : str1.toCharArray()) {
            if (sbIdx < sbLen && (str2.charAt(sbIdx) - c + 26) % 26 <= 1) {
                sbIdx++;
            }
        }
        return sbIdx == sbLen;
    }
}