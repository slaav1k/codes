import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(findTheDifference("a", "aa"));
    }

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            int k = map.getOrDefault(c, 0);
            if (k != 0) {
                map.put(c, map.getOrDefault(c, 0) - 1);
            }
            else return c;
        }
        return ' ';
    }
}