import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = in.nextInt();
            intervals[i][1] = in.nextInt();
        }
        in.close();

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int count = 0;
        int lastEnd = -1;

        for (int[] interval : intervals) {
            if (lastEnd < interval[0]) {
                count++;
                lastEnd = interval[1];
            }
        }
        System.out.println(count);
    }
}