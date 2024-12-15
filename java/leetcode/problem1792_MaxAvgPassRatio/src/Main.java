import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxAverageRatio(new int[][] {{1, 2}, {3, 5}, {2, 2}}, 2));
    }

    public static double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    double tA = wonByExtra(a[0], a[1]);
                    double tB = wonByExtra(b[0], b[1]);
                    return Double.compare(tB, tA);
                }
        );

        for (int[] aClass : classes) {
            pq.offer(aClass);
        }

        for (int i = 0; i < extraStudents; i++) {
            int[] p = pq.poll();
            p[0] += 1;
            p[1] += 1;
            pq.offer(p);
        }

        double sum = 0;
        for (int[] p : pq) {
            sum += (double) p[0] / p[1];
        }

        return Math.floor(sum / classes.length * 1e5) / 1e5;
    }

    private static double wonByExtra(int pass, int count) {
        double ratioNow = (double) pass / (double) count;
        double ratioNew = (double) (pass + 1) / (double) (count + 1);
        return ratioNew - ratioNow;
    }

}