import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static class Element {
        int value;
        int count;

        Element(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        if (line1 == null) return;
        int n = Integer.parseInt(line1.trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Element> stack = new ArrayDeque<>();
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < n; i++) {
            int currentVal = Integer.parseInt(st.nextToken());
            int visibleCount = 0;

            while (!stack.isEmpty() && stack.peekLast().value < currentVal) {
                visibleCount += stack.removeLast().count;
            }


            out.print(visibleCount + " ");

            stack.addLast(new Element(currentVal, visibleCount + 1));
        }

        out.println();
        out.flush();
        out.close();
    }
}