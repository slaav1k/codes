public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(
                solution.findDisappearedNumbers(
                        new int[] {4, 3, 2, 7, 8, 2, 3, 1}
                )
        );

        System.out.println(
                solution.findDisappearedNumbers(
                        new int[] {1, 1}
                )
        );


    }
}