import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line1 = br.readLine();
        if (line1 == null) return;
        int n = Integer.parseInt(line1.trim());

        String s = br.readLine().trim();
        Deque<Character> deque = new ArrayDeque<>(n);
        for (int i = 0; i < n; i++) {
            deque.addLast(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        while (!deque.isEmpty()) {
            char left = deque.peekFirst();
            char right = deque.peekLast();

            if (left <= right) {
                sb.append(deque.pollFirst());
            } else {
                sb.append(deque.pollLast());
            }
        }

        out.println(sb.toString());
        out.flush();
        out.close();
    }
}