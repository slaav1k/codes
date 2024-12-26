import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[] {2, 4}, new int[] {1, 2, 3, 4})));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int k = 0; k < nums1.length; k++) {
            int max = -1;
            boolean found = true;
            int el = nums1[k];
            for (int i = 0; i < nums2.length; i++) {
                if (el == nums2[i] && found) {
                   found = false;
                }
                if (!found && nums2[i] > el) {
                    max = nums2[i];
                    break;
                }
            }
            res[k] = max;
        }
        return res;
    }
}