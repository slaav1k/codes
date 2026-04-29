import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        List<Set<Integer>> sets = new ArrayList<>(n);
        long totalElements = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            Set<Integer> s = new HashSet<>(k);
            for (int j = 0; j < k; j++) {
                s.add(Integer.parseInt(st.nextToken()));
            }
            sets.add(s);
            totalElements += k;
        }

        if (n == 0) {
            System.out.println("NO");
            return;
        }

        Set<Integer> core = new HashSet<>(sets.get(0));
        for (int i = 1; i < n; i++) {
            core.retainAll(sets.get(i));
            if (core.isEmpty()) break;
        }


        Map<Integer, Integer> petalCount = new HashMap<>((int)(totalElements * 1.5));

        int[] petalSizes = new int[n];

        for (int i = 0; i < n; i++) {
            Set<Integer> s = sets.get(i);
            int petalSize = 0;

            for (int x : s) {
                if (!core.contains(x)) {
                    petalSize++;
                    petalCount.put(x, petalCount.getOrDefault(x, 0) + 1);
                }
            }
            petalSizes[i] = petalSize;
        }

        boolean isSunflower = true;
        for (int cnt : petalCount.values()) {
            if (cnt > 1) {
                isSunflower = false;
                break;
            }
        }

        if (isSunflower) {
            System.out.println("YES");
            System.out.println(core.size());
            for (int sz : petalSizes) {
                System.out.print(sz + " ");
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }
    }
}