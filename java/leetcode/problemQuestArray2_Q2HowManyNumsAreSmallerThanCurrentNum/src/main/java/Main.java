import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(
                s.smallerNumbersThanCurrent(
                        new int[] {
                                8, 1, 2, 2, 3
                        }
                )
        ));

        System.out.println(Arrays.toString(
                s.smallerNumbersThanCurrent(
                        new int[] {
                                6, 5, 4, 8
                        }
                )
        ));

        System.out.println(Arrays.toString(
                s.smallerNumbersThanCurrent(
                        new int[] {
                                7, 7, 7, 7
                        }
                )
        ));
    }
}