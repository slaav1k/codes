//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        merge(new int[] {1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return;
        if (m == 0){
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        int i = 0, j = 0, k = 0;
        int[] temp = new int[m + n];
        while (i < m || j < n) {
            if (i == m) {
                temp[k] = nums2[j];
                j++;
            }
            else if (j == n) {
                temp[k] = nums1[i];
                i++;
            }
            else if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
            }
            else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }
        System.arraycopy(temp, 0, nums1, 0, m + n);
        return;
    }
}