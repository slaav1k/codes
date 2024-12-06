import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxCount(new int[] {1, 6, 5}, 5 , 6));
    }

    public static int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }

        int sum = 0;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (bannedSet.contains(i)) {
                continue;
            }

            if (i + sum > maxSum) {
                break;
            }

            sum += i;
            count++;
        }
        return count;
    }
}