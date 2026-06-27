import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d, w;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a[1] != b[1]) {
                        return Integer.compare(b[1], a[1]);
                    }
                    return Integer.compare(a[0], b[0]);
                }
        );

        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            d = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            pq.add(new int[] {d, w});
        }

        PriorityQueue<Long> workers = new PriorityQueue<>();


        workers.add(0L);
        workers.add(0L);

        while (!pq.isEmpty()) {
            int[] task = pq.poll();
            long freeTime = workers.poll();

            workers.add(freeTime + task[0]);
        }

        long res = 0;
        while (!workers.isEmpty()) {
            res = Math.max(res, workers.poll());
        }

        out.println(res);

        out.flush();
        out.close();
    }
}