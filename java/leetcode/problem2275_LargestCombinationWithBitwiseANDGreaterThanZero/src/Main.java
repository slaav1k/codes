//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(largestCombination(new int[] {16,17,71,62,12,24,14}));
    }

    public static int largestCombination(int[] candidates) {
        int n = candidates.length;
        int[] bits = new int[24];
        for (int i = 0; i < 24; i++) {
            for(int num : candidates) {
                if ((num & (1 << i)) != 0) {
                    bits[i] += 1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < 24; i++) {
            max = Math.max(max, bits[i]);
        }
        return max;
    }
}