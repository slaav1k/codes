public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.buildArray(
                new int[] {1, 3}, 3
        ));

        System.out.println(s.buildArray(
                new int[] {1, 2, 3}, 3
        ));

        System.out.println(s.buildArray(
                new int[] {1, 2}, 4
        ));
    }
}