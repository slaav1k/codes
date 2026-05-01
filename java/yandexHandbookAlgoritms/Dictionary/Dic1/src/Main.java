import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());

        HashMap<Integer, Integer> dic = new HashMap<>();


        int type, x, y;

        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            type = Integer.parseInt(tokenizer.nextToken());
            x = Integer.parseInt(tokenizer.nextToken());

            if (type == 1) {
                y = Integer.parseInt(tokenizer.nextToken());
                dic.put(x, y);
            } else {
                if (dic.containsKey(x)) {
                    out.println(dic.get(x));
                } else {
                    out.println(-1);
                }
            }
        }


        out.println();
        out.flush();
        out.close();
    }
}