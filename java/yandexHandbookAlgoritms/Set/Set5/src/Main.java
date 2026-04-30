import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> allOR = new HashSet<>();
        Set<Integer> current = new HashSet<>();
        Set<Integer> next;

        for (int i = 0; i < n; i++) {
            next = new HashSet<>();

            next.add(a[i]);

            for (int prev : current) {
                next.add(prev | a[i]);
            }

            allOR.addAll(next);

            current = next;
        }

        System.out.println(allOR.size());
    }
}