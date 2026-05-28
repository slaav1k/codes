import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            words[i] = tokenizer.nextToken();
        }

        int len = words[0].length();
        long totalPairs = 0;

        for (int pos = 0; pos < len; pos++) {
            Map<String, Integer> maskGroups = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String word = words[i];
                String mask = word.substring(0, pos) + "*" + word.substring(pos + 1);
                maskGroups.put(mask, maskGroups.getOrDefault(mask, 0) + 1);
            }

            for (int count : maskGroups.values()) {
                if (count > 1) {
                    totalPairs += (long) count * (count - 1) / 2;
                }
            }
        }

        Map<String, Integer> exactDuplicates = new HashMap<>();
        for (int i = 0; i < n; i++) {
            exactDuplicates.put(words[i], exactDuplicates.getOrDefault(words[i], 0) + 1);
        }

        long exactDuplicatePairs = 0;
        for (int count : exactDuplicates.values()) {
            if (count > 1) {
                exactDuplicatePairs += (long) count * (count - 1) / 2;
            }
        }

        long res = totalPairs - (exactDuplicatePairs * len);

        PrintWriter out = new PrintWriter(System.out);
        out.println(res);
        out.flush();
        out.close();
    }
}