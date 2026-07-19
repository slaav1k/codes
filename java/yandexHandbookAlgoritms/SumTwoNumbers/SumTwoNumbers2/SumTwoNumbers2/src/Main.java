import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int[] result = new int[12];

        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = n; i >= 0; i--) {
            result[i] += Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine());
        for (int i = m; i >= 0; i--) {
            result[i] += Integer.parseInt(st.nextToken());
        }

        int maxDegree = Math.max(n, m);

        out.println(maxDegree);

        StringBuilder sb = new StringBuilder();
        for (int i = maxDegree; i >= 0; i--) {
            sb.append(result[i]).append(" ");
        }

        if (!sb.isEmpty()) {
            sb.setLength(sb.length() - 1);
        }

        out.println(sb.toString());
        out.flush();
        out.close();
    }
}