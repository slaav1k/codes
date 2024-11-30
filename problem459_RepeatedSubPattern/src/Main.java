public class Main {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabcbb"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n - 1; i++) {
            sb.append(s.charAt(i));
            if (n % sb.length() == 0) {
                String subString = sb.toString().repeat(n / sb.length());
                if (subString.equals(s)) {
                    return true;
                }
            };
        }
        return false;
    }
}