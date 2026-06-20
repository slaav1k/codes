import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        Deque<Integer> stack = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            stack.addLast(Integer.parseInt(st.nextToken()));
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(stack.size());

        out.flush();
        out.close();
    }
}