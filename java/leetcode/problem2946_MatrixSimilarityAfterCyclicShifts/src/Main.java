public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.areSimilar(
                new int[][] {
                        new int[] {1, 2, 1, 2},
                        new int[] {5, 5, 5, 5},
                        new int[] {6, 3, 6, 3}
                },
                2
        ));
    }
}