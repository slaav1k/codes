import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.avoidFlood(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(sol.avoidFlood(new int[]{1, 2, 0, 0, 2, 1})));
        System.out.println(Arrays.toString(sol.avoidFlood(new int[]{1, 2, 0, 1, 2})));
    }
}