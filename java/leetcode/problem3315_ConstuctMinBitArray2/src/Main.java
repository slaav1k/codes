import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.minBitwiseArray(
                new ArrayList<>(List.of(2, 3, 5, 7))
        )));
        System.out.println(Arrays.toString(s.minBitwiseArray(
                new ArrayList<>(List.of(
                        11, 13, 31
                ))
        )));
    }
}