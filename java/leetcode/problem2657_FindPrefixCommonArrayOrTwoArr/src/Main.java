import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findThePrefixCommonArray(new int[]{1, 3, 2, 4}, new int[]{3, 1, 2, 4})));
        System.out.println(Arrays.toString(findThePrefixCommonArray(new int[]{2, 3, 1}, new int[]{3, 1, 2})));
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] result = new int[A.length];
        Set<Integer> seen = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (seen.contains(A[i])) {
                common.add(A[i]);
            } else {
                seen.add(A[i]);
            }
            if (seen.contains(B[i])) {
                common.add(B[i]);
            } else {
                seen.add(B[i]);
            }
            result[i] = common.size();
        }

        return result;
    }
}