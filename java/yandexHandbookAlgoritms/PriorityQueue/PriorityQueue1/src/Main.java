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
        int q, a;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            q = Integer.parseInt(st.nextToken());

            if (q == 1) {
                a = Integer.parseInt(st.nextToken());
                pq.add(a);
            } if (q == 2) {
                pq.poll();
            }

            if (pq.isEmpty()) {
                out.println(-1);
            } else {
                out.printf("%d\n", pq.peek());
            }
        }

        out.flush();
        out.close();
    }
}