//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        int lenHaystack = haystack.length();
        int lenNeedle = needle.length();
        if (lenNeedle > lenHaystack) {
            return -1;
        }
        if (lenNeedle == lenHaystack && needle.equals(haystack)){
            return 0;
        }
        for (int i = 0; i < lenHaystack - lenNeedle; i++) {
            if (haystack.substring(i, i + lenNeedle).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}