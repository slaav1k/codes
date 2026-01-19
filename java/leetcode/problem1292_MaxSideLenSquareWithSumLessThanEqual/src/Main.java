public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxSideLength(
                new int[][] {
                        {
                                1, 1, 3, 2, 4, 3, 2
                        },
                        {
                            1,1,3,2,4,3,2
                        },
                        {
                            1,1,3,2,4,3,2
                        }
                },
                4
        ));
    }
}