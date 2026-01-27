import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int minCost(int n, int[][] edges) {
        List<int[]>[] graph = new List[n];
        int u, v, w;

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            u = edge[0];
            v = edge[1];
            w = edge[2];
            graph[u].add(new int[]{v, w});
            graph[v].add(new int[]{u, 2 * w});
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE / 2);
        dist[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 0});

        int[] cur;
        int cost, newCost;

        while (!pq.isEmpty()) {
            cur = pq.poll();
            cost = cur[0];
            u = cur[1];

            if (cost > dist[u]) {
                continue;
            }

            for (int[] edge : graph[u]) {
                v = edge[0];
                w = edge[1];
                newCost = cost + w;

                if (newCost < dist[v]) {
                    dist[v] = newCost;
                    pq.offer(new int[]{newCost, v});
                }
            }

        }

        return dist[n - 1] == Integer.MAX_VALUE / 2 ? -1  : dist[n - 1];
    }
}