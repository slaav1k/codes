import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return res;
        }
        int[] pair;

        PriorityQueue<int[]> heap = new PriorityQueue<>(
                (a, b) -> (nums1[a[0]] + nums2[a[1]]) -
                        (nums1[b[0]]+nums2[b[1]])
        );

        for (int j = 0; j < Math.min(nums2.length, k); j++) {
            heap.offer(new int[] {0, j});
        }

        int i, j;

        while (res.size() < k && !heap.isEmpty()) {
            pair = heap.poll();
            i = pair[0];
            j = pair[1];

            res.add(List.of(nums1[i], nums2[j]));

            if (i + 1 < nums1.length) {
                heap.offer(new int[] {i + 1, j});
            }
        }
        return res;
    }
}