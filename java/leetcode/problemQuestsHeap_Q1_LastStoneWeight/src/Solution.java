import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int lastStoneWeight(int[] stones) {
        int x, y;
        PriorityQueue<Integer> heap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            heap.add(stone);
        }

        while (heap.size() > 1) {

            y = heap.poll();
            x = heap.poll();

            if (x != y) {
                heap.add(y - x);
            }
        }

        return heap.isEmpty() ? 0 : heap.peek();
    }
}