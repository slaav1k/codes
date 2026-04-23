import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int[] arr = new int[n];

        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        boolean[] toRemove = new boolean[n];
        int removedCount = 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                toRemove[i] = true;
                removedCount++;
            }
        }

        PrintWriter out = new PrintWriter(System.out);

        out.println(n - removedCount);

        boolean first = true;
        for (int i = 0; i < n; i++) {
            if (!toRemove[i]) {
                if (!first) {
                    out.print(" ");
                }
                out.print(arr[i]);
                first = false;
            }
        }

        out.println();
        out.flush();
        out.close();


    }
}