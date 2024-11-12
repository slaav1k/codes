import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maximumBeauty(new int[][] {{1,2},{3,2},{2,4},{5,6},{3,5}}, new int[] {1, 2, 3, 4, 5, 6})));
    }

    public static int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, Comparator.comparingInt(a -> a[0]));

        int n = items.length;
        int[] maxBeauty = new int[n];
        maxBeauty[0] = items[0][1];

        for (int i = 1; i < n; i++) {
            maxBeauty[i] = Math.max(maxBeauty[i - 1], items[i][1]);
        }

        int m = queries.length;
        int[][] indexedQueries = new int[m][2];
        for (int i = 0; i < m; i++) {
            indexedQueries[i][0] = queries[i];
            indexedQueries[i][1] = i;
        }
        Arrays.sort(indexedQueries, Comparator.comparingInt(a -> a[0]));

        int[] res = new int[m];
        int j = 0;

        for (int[] query : indexedQueries) {
            int queryPrice = query[0];
            int originalIndex = query[1];

            while (j < n && items[j][0] <= queryPrice) {
                j++;
            }
            res[originalIndex] = j > 0 ? maxBeauty[j - 1] : 0;
        }

        return res;
    }
}