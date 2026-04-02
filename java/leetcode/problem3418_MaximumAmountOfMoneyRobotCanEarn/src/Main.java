public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] coins = {{0, 1, -1}, {1, -2, 3}, {2, -3, 4}};
        System.out.println(sol.maximumAmount(coins));
    }
}