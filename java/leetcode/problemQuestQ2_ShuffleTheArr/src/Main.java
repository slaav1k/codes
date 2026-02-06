import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(solution.shuffle(arr, 3)));
        arr = new int[]{1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(solution.shuffle(arr, 4)));
    }
}