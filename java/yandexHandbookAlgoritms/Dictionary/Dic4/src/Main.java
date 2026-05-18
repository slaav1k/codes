import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Map.Entry<Integer, Integer>> list = getEntries();

        list.sort((a, b) -> {
            if (b.getValue() != a.getValue()) {
                return b.getValue() - a.getValue();
            }
            return a.getKey() - b.getKey();
        });

        int x1 = list.get(0).getKey();
        int x2 = list.get(1).getKey();
        int x3 = list.get(2).getKey();

        int[] res = {x1, x2, x3};
        Arrays.sort(res);

        System.out.println(res[0] + " " + res[1] + " " + res[2]);
    }

    private static List<Map.Entry<Integer, Integer>> getEntries() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        return list;
    }
}