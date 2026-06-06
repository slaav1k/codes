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
                deque.addFirst(a);
            } else if (q == 2) {
                a = Integer.parseInt(st.nextToken());
                deque.addLast(a);
            } else if (q == 3){
                deque.pollFirst();
            } else {
                deque.pollLast();
            }

            if (deque.isEmpty()) {
                out.println(-1);
            } else {
                out.printf("%d %d\n", deque.getFirst(), deque.getLast());
            }
        }

        out.flush();
        out.close();
    }
}