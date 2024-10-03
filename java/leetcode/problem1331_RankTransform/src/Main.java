import java.util.Arrays;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{100, 100, 100})));
    }

    public static int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int j : arr) {
            set.add(j);
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = set.headSet(arr[i]).size() + 1;
        }
        return res;
    }
}