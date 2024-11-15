import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null) return false;
        if (ransomNote.length() > magazine.length()) return false;
        Map<Character, Integer> magazineMap = new HashMap<Character, Integer>();
        for (char c : magazine.toCharArray()) {
            if (magazineMap.containsKey(c)) {
                magazineMap.put(c, magazineMap.get(c) + 1);
            }
            else {
                magazineMap.put(c, 1);
            }
        }
        for (char c : ransomNote.toCharArray()) {
            if (magazineMap.containsKey(c)) {
                if (magazineMap.get(c) == 0) {
                    return false;
                }
                magazineMap.put(c, magazineMap.get(c) - 1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}