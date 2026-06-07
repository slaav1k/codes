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
        PrintWriter out = new PrintWriter(System.out);

        String line1 = br.readLine();
        if (line1 == null) return;
        int n = Integer.parseInt(line1.trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>(n);
        for (int i = 0; i < n; i++) {
            deque.addLast(Integer.parseInt(st.nextToken()));
        }

        int prev, now, next, lastWinner;
        lastWinner = -1;

        while (deque.size() != 2) {
            now = deque.pollFirst();
            next = deque.pollFirst();
            prev = deque.pollLast();

            if (now > next && now > prev) {
                if (next > prev) {
                    deque.addFirst(next);
                } else {
                    deque.addLast(prev);
                }
                deque.addFirst(now);
                lastWinner = now;
            } else if (prev > now && prev > next) {
                if (now > next) {
                    deque.addFirst(now);
                } else {
                    deque.addFirst(next);
                }
                deque.addFirst(prev);
                lastWinner = prev;
            } else {
                if (prev > now) {
                    deque.addLast(prev);
                } else {
                    deque.addLast(now);
                }
                deque.addFirst(next);
                lastWinner = next;
            }
        }

        int a = deque.pollFirst();
        int b = deque.pollFirst();

        if (lastWinner == a) {
            out.println(a + " " + b);
        } else {
            out.println(b + " " + a);
        }


        out.flush();
        out.close();
    }
}