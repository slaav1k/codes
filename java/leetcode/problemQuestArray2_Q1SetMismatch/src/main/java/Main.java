import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.findErrorNums(
                new int[] {1, 2, 2, 4}
        )));

        System.out.println(Arrays.toString(s.findErrorNums(
                new int[] {1, 1}
        )));
    }
}