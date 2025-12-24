public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.minimumBoxes(
                new int[] {1, 3, 2},
                new int[] {4, 3, 1, 5, 2}
        ));
        System.out.println(sol.minimumBoxes(
                new int[] {5, 5, 5},
                new int[] {2, 4, 2, 7}
        ));
    }
}