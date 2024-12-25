import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[] {1, 4}, 2));
        System.out.println(findPoisonedDuration(new int[] {1, 2}, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) return 0;
        int n = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i] + duration - 1 >= timeSeries[i + 1]) {
                n += timeSeries[i + 1] - timeSeries[i];
            } else {
                n += duration;
            }
        }
        n += duration;
        return n;
    }
}