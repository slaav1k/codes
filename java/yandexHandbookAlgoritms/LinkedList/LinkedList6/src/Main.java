import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int[] arr = new int[n];

        int maxEl, maxIdx, tmp;
        maxEl = Integer.MIN_VALUE;
        maxIdx = - 1;

        tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(tokenizer.nextToken());
            arr[i] = tmp;
            if (tmp >= maxEl) {
                maxEl = tmp;
                maxIdx = i;
            }
        }

        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < n; i++) {
            if (i != maxIdx) {
                if (i != 0) {
                   out.print(" ");
                }
                out.print(arr[i]);
            }
        }

        out.println();
        out.flush();
        out.close();


    }
}