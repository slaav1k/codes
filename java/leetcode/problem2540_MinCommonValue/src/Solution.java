import java.util.HashSet;
import java.util.TreeSet;

class Solution {
    public int getCommonSet(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        TreeSet<Integer> res = new TreeSet<>(set1);

        res.retainAll(set2);

        if (!res.isEmpty()) {
            return res.getFirst();
        }

        return -1;


    }

    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;

        while (i < n1 && j < n2) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return -1;
    }

}