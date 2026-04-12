import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        if (line1 == null) return;

        int n = Integer.parseInt(line1.trim());

        String line2 = br.readLine();
        if (line2 == null) return;
        PrintWriter out = getPrintWriter(line2, n);
        out.close();
    }

    private static PrintWriter getPrintWriter(String line2, int n) {
        StringTokenizer st = new StringTokenizer(line2);

        PrintWriter out = new PrintWriter(System.out);

        int mn = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (!st.hasMoreTokens()) break;

            int tmp = Integer.parseInt(st.nextToken());
            if (tmp < mn) {
                mn = tmp;
            }

            out.print(mn);
            if (i < n - 1) {
                out.print(" ");
            }
        }

        out.flush();
        return out;
    }
}