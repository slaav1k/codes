//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(maxScoreSightseeingPair(new int[] {8, 1, 5, 2, 6}));
        System.out.println(maxScoreSightseeingPair(new int[] {1, 2}));
    }

    public static int maxScoreSightseeingPair(int[] values) {
        int max = Integer.MIN_VALUE;
        int n = values.length;
        int tmp = values[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, values[i] + tmp - i);
            tmp = Math.max(tmp, values[i] + i);
        }
        return max;
    }
}