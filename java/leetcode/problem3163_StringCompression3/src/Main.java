import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(compressedString("ft"));
    }

    public static String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < word.length()) {
            char c = word.charAt(i);
            int count = 0;

            while (i < word.length() && word.charAt(i) == c && count < 9) {
                count++;
                i++;
            }

            sb.append(count).append(c);
        }

        return sb.toString();
    }

}