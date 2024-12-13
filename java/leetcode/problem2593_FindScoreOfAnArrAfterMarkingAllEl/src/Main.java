import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) {
        System.out.println(findScore(new int[] {2, 1, 3, 4, 5, 2}));
        System.out.println(findScore(new int[] {2, 3, 5, 1, 3, 2}));
    }

    public static long findScore(int[] nums) {
        int n = nums.length;
        boolean[] marked = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{nums[i], i});
        }

        long score = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int value = current[0];
            int index = current[1];

            if (marked[index]) continue;

            score += value;

            marked[index] = true;
            if (index > 0) marked[index - 1] = true;
            if (index < n - 1) marked[index + 1] = true;
        }
        return score;
    }
}