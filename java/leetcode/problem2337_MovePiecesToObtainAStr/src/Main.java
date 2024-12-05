public class Main {
    public static void main(String[] args) {
        System.out.println(canChange("_L__R__R_", "L______RR"));
        System.out.println(canChange("R_L_", "__LR"));
        System.out.println(canChange("_R", "R_"));
    }

    public static boolean canChange(String start, String target) {
        int i = 0, j = 0;
        int len = start.length();
        while (i < len || j < len) {
            while (i < len && start.charAt(i) == '_') {
                i++;
            }
            while (j < len && target.charAt(j) == '_') {
                j++;
            }
            if (i == len || j == len) {
                return i == j;
            }
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            }
            if (start.charAt(i) == 'L' && i < j) {
                return false;
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}