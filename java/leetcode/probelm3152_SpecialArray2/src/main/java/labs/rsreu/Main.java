package labs.rsreu;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(isArraySpecial(new int[]{3, 4, 1, 2, 6},
                        new int[][]{{0, 4}})));

        System.out.println(
                Arrays.toString(isArraySpecial(new int[]{4, 1, 3, 6},
                        new int[][]{{0, 2}, {2, 3}})));
    }

    public static boolean isOdd(int num) {
        return num % 2 == 0;
    }


    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] answer = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            boolean flag = true;
            for (int k = a; k < b; k++) {
                if ((isOdd(nums[k]) && isOdd(nums[k + 1]))
                        || (!isOdd(nums[k]) && !isOdd(nums[k + 1]))) {
                    flag = false;
                    break;
                }
            }
            answer[i] = flag;
        }
        return answer;
    }
}