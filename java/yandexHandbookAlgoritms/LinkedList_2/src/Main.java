import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();

        LinkedList<Integer> lst = new LinkedList<>();

        for (String i : input.split(" ")) {
            lst.add(Integer.parseInt(i));
        }

        long minDiff = Long.MAX_VALUE;
        int i1 = 1, j1 = 2;
        int currentMinVal = lst.getFirst();
        int currentMinIdx = 1;

        long maxDiff = Long.MIN_VALUE;
        int i2 = 1, j2 = 2;
        int currentMaxVal = lst.getFirst();
        int currentMaxIdx = 1;

        int dMin, dMax;

        int currentIdx = 1;
        for (Integer val : lst) {
            if (currentIdx == 1) {
                currentIdx++;
                continue;
            }

            dMin = currentMinVal - val;
            dMax = currentMaxVal - val;

            if (dMin < minDiff) {
                minDiff = dMin;
                i1 = currentMinIdx;
                j1 = currentIdx;
            }

            if (dMax > maxDiff) {
                maxDiff = dMax;
                i2 = currentMaxIdx;
                j2 = currentIdx;
            }

            if (val < currentMinVal) {
                currentMinVal = val;
                currentMinIdx = currentIdx;
            }

            if (val > currentMaxVal) {
                currentMaxVal = val;
                currentMaxIdx = currentIdx;
            }

            currentIdx++;
        }

        System.out.println(i1 + " " + j1);
        System.out.println(i2 + " " + j2);
    }
}