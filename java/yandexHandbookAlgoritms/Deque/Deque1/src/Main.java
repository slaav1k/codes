import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q, a;

        Deque<Integer> deque = new ArrayDeque<>();

        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            q = Integer.parseInt(st.nextToken());

            if (q == 1) {
                a = Integer.parseInt(st.nextToken());
                deque.add(a);
            } else {
                deque.pollFirst();
            }

            if (deque.isEmpty()) {
                out.println(-1);
            } else {
                out.println(deque.getFirst());
            }
        }

        out.flush();
        out.close();
    }
}