import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(pickGifts2(new int[] {25, 64, 9, 4, 100}, 4));
        System.out.println(pickGifts2(new int[] {1, 1, 1, 1}, 4));
    }

    public static long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            int maxElId = maxId(gifts);
            gifts[maxElId] = (int) Math.pow(gifts[maxElId], 0.5);
        }
        return Arrays.stream(gifts).asLongStream().sum();
    }

    public static int maxId(int[] gifts) {
        int maxId = 0;
        int maxEL = 0;
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] > maxEL) {
                maxId = i;
                maxEL = gifts[i];
            }
        }
        return maxId;
    }

    public static long pickGifts2(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int el : gifts) {
            pq.add(el);
        }
        for (int i = 0; i < k; i++) {
            int el = pq.poll();
            pq.add((int) Math.pow(el, 0.5));
        }
        long sum = 0;
        for (int el : pq) {
            sum += el;
        }
        return sum;
    }
}