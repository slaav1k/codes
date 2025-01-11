//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int len = chars.length;

        for (int i = 0; i < len; i += k << 1) {
            reverse(chars, i, Math.min(len - 1, i + k - 1));
        }
        return new String(chars);
    }

    public static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }
}