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
        int k = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> {
                    return Integer.compare(b, a);
                }
        );

        PrintWriter out = new PrintWriter(System.out);
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {

            pq.add(Integer.parseInt(st.nextToken()));

        }

        long res = 0;
        int cur;

        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            cur = pq.poll();
            if (cur < 0) break;
            res += cur;
        }

        out.println(res);

        out.flush();
        out.close();
    }
}