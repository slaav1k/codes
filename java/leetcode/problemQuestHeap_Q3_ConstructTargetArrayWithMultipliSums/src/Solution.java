import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        long totalSum = 0;

        for (int num : target) {
            totalSum += num;
            maxHeap.offer(num);
        }

        while (true) {
            int maxVal = maxHeap.poll();

            if (maxVal == 1) {
                return true;
            }

            long restSum = totalSum - maxVal;

            if (restSum == 1) {
                return true;
            }

            if (restSum >= maxVal || restSum == 0) {
                return false;
            }

            int prev = (int)(maxVal % restSum);

            if (prev == 0) {
                prev = (int)restSum;
            }

            totalSum = totalSum - maxVal + prev;
            maxHeap.offer(prev);
        }
    }
}