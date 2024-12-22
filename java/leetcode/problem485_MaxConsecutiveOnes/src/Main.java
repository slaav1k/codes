//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
        System.out.println(maxConsecutiveOnes(new int[] {1, 1, 0, 1, 0, 1}));
    }

    public static int maxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tmpMax = 0;
        for (int i = 0; i < nums.length; i++) {
//            if (i == 0 && nums[i] == 1) {
//                tmpMax = 1;
//            } else {
//                if (nums[i] == 1 && nums[i - 1] == 1) {
//                    tmpMax += 1;
//                } else if (nums[i] == 1 && nums[i - 1] == 0) {
//                    tmpMax = 1;
//                }else {
//                    max = Math.max(max, tmpMax);
//                    tmpMax = 0;
//                }
//            }
            if (nums[i] == 1) {
                tmpMax += 1;
                max = Math.max(max, tmpMax);
            } else {
                tmpMax = 0;
            }
        }
        return Math.max(max, tmpMax);
    }
}