import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new ArrayDeque<>();
        int res = 0;
        int tmp;

        for (int ticket: tickets) {
            q.add(ticket);
        }

        while (true) {
            tmp = q.poll();
            tmp--;
            res++;

            if (tmp == 0 && k == 0) {
               return res;
            }

            if (tmp > 0) {
                q.add(tmp);
            }

            k--;
            if (k < 0) {
                k = q.size() - 1;
            }
        }

    }
}