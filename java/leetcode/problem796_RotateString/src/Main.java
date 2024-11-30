import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }

    public  static boolean rotateString(String s, String goal) {
        if (s.length() == 0 || goal.length() == 0) return false;
        if (s.length() != goal.length()) return false;
        char[] sArray = s.toCharArray();
        char[] goalArray = goal.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(goalArray);
        if (!Arrays.equals(sArray, goalArray)) return false;
        String doubledGoal = goal + goal;
        return doubledGoal.contains(s);
    }
}