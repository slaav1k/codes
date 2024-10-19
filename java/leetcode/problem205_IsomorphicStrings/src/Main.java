import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c2 = t.charAt(i);
            if (mapS.containsKey(c)) {
                if (!mapS.get(c).equals(c2)) return false;
            } else {
                mapS.put(c, c2);
            }
            if (mapT.containsKey(c2)) {
                if (!mapT.get(c2).equals(c)) return false;
            } else {
                mapT.put(c2, c);
            }
        }
        return true;
    }
}