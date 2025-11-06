import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.processQueries(5, new int[][]{
                {1, 2}, {2, 3}, {3, 4}, {4, 5}
        }, new int[][]{
                {1, 3}, {2, 1}, {1, 1}, {2, 2}, {1, 2}
        })));

        System.out.println(Arrays.toString(sol.processQueries(3, new int[][]{
        }, new int[][]{
                {1, 1}, {2, 1}, {1, 1}
        })));
    }
}