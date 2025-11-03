public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minCost("abaac",
                new int[] {1, 2, 3, 4, 5}));
        System.out.println(s.minCost("abc",
                new int[] {1, 2, 3}));
        System.out.println(s.minCost("aabaa",
                new int[] {1, 2, 3, 4, 1}));
    }
}