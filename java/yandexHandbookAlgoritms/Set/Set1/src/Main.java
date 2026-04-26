import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        String op, el;
        String[] stroka;

        Set<String> st = new HashSet<>();
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            op = tokenizer.nextToken();
            el = tokenizer.nextToken();
            if (op.equals("1")) {
                st.add(el);
            } else {
                if (st.contains(el)) {
                    out.println(1);
                } else {
                    out.println(0);
                }
            }
        }

        out.println();
        out.flush();
        out.close();
    }
}