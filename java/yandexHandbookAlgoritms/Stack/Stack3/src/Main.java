import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        if (line1 == null) return;
        int n = Integer.parseInt(line1.trim());
        String line2 = br.readLine();
        int k = Integer.parseInt(line2.trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        PrintWriter out = new PrintWriter(System.out);

        int currentVal;

        int res = 0;

        for (int i = 0; i < n; i++) {
            currentVal = Integer.parseInt(st.nextToken());

            if (stack.size() < k) {
                stack.addLast(currentVal);
            }

            if (stack.size() == k) {
               res += minInStack(stack);
               stack.removeFirst();
            }

        }

        out.println(res);
        out.println();
        out.flush();
        out.close();
    }

    private static int minInStack(Deque<Integer> pStack) {
        int min = Integer.MAX_VALUE;
        for (int el: pStack) {
           if (el < min) {
               min = el;
           }
        }
        return min;
    }
}