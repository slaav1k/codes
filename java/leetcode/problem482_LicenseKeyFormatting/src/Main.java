public class Main {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '-') {
                sb.append(Character.toUpperCase(c));
            }
        }
        StringBuilder res = new StringBuilder();
        int len = sb.length();
        int first = len % k;
        if (first > 0) {
            res.append(sb.subSequence(0, first));
        }
        for (int i = first; i < len; i += k) {
            if (!res.isEmpty()) {
                res.append('-');
            }
            res.append(sb, i, i + k);
        }
        return res.toString();
    }

}