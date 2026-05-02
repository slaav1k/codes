import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());

        TreeMap<Integer, Integer> dic = new TreeMap<>();

        tokenizer = new StringTokenizer(br.readLine());
        int a;

        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(tokenizer.nextToken());
            dic.put(a, dic.getOrDefault(a, 0) + 1);
        }

        int mn = Integer.MIN_VALUE;
        int mnIdx = -1;

        for (int key: dic.keySet()) {
            a = dic.get(key);
            if (a > mn) {
                mn = a;
                mnIdx = key;
            }
        }

        PrintWriter out = new PrintWriter(System.out);

        out.println(mnIdx);
        out.flush();
        out.close();
    }
}