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

        Set<Integer> st = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();


        int size;

        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            size = Integer.parseInt(tokenizer.nextToken());
            st2 = new HashSet<>();
            for (int j = 0; j < size; j++) {
                st2.add(Integer.parseInt(tokenizer.nextToken()));
            }
            if (i != 0) {
                st.retainAll(st2);
            } else {
                st = st2;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.print(st.size());


        out.println();
        out.flush();
        out.close();
    }
}