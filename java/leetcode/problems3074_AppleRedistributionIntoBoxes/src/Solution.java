import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int a : apple ) {
            sum += a;
        }
        Arrays.sort(capacity);
        int boxes = 0;
        int n = capacity.length - 1;
        while (n >= 0) {
            sum -= capacity[n--];
            boxes++;
            if (sum <= 0) break;
        }
        return boxes;
    }
}