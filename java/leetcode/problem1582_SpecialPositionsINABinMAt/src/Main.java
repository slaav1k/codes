public class Main {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[][] mat = new int[][] {
                new int[] {1, 0, 0},
                new int[] {0, 0, 1},
                new int[] {1, 0, 0}
        };

        System.out.println(s.numSpecial(mat));

        int[][] mat2 = new int[][] {
                new int[] {1, 0, 0},
                new int[] {0, 1, 0},
                new int[] {0, 0, 1}
        };

        System.out.println(s.numSpecial(mat2));
    }
}