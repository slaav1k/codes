import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

import static java.lang.System.out;

public class Main {
    private static final LinkedList<Integer> lst = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[] firstOccurrence = new int[100001];
        Arrays.fill(firstOccurrence, -1);
        int val;

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            val = Integer.parseInt(st.nextToken());

            if (firstOccurrence[val] == -1) {
                firstOccurrence[val] = i;
            }
        }

        int qi;

        for (int i = 0; i < q; i++) {
            qi = Integer.parseInt(br.readLine());
            if (qi > 100000 || qi < 0) {
                out.println("-1");
            } else {
                out.println(firstOccurrence[qi]);
            };
        }
    }
}