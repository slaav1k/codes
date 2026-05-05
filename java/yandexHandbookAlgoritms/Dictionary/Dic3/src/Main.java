import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());

        Map<String, Integer> count = new HashMap<>();
        Map<String, int[]> fractionMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(tokenizer.nextToken());
            int den = Integer.parseInt(tokenizer.nextToken());

            int gcd = gcd(num, den);
            num /= gcd;
            den /= gcd;

            String key = num + "/" + den;

            count.put(key, count.getOrDefault(key, 0) + 1);
            fractionMap.putIfAbsent(key, new int[]{num, den});
        }

        int maxFreq = -1;
        int bestNum = Integer.MAX_VALUE;
        int bestDen = 1;

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            int freq = entry.getValue();
            int[] frac = fractionMap.get(entry.getKey());
            int num = frac[0];
            int den = frac[1];

            boolean better = false;

            if (freq > maxFreq) {
                better = true;
            } else if (freq == maxFreq) {
                if ((long) num * bestDen < (long) bestNum * den) {
                    better = true;
                }
            }

            if (better) {
                maxFreq = freq;
                bestNum = num;
                bestDen = den;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(bestNum + " " + bestDen);
        out.flush();
        out.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }
}