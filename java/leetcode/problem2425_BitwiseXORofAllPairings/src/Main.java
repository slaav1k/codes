//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(xorAllNums(new int[] {2, 1, 3}, new int[] {10, 2, 5, 0}));
        System.out.println(xorAllNums(new int[] {1, 2}, new int[] {3, 4}));
    }

    public static int xorAllNums(int[] nums1, int[] nums2) {
        int a = 0, b = 0;
        int len = nums1.length;
        int len2 = nums2.length;

        if (len % 2 != 0) {
            for (int num : nums2) {
                b ^= num;
            }
        }

        if (len2 % 2 != 0) {
            for (int num : nums1) {
                a ^= num;
            }
        }

        return a ^ b;

    }
}