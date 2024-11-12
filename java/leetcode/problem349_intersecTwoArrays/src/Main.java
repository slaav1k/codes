import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                res.add(nums2[i]);
                set1.remove(nums2[i]);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}