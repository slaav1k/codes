package labs.rsreu;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxScore("1111"));
        System.out.println(maxScore("00111"));
        System.out.println(maxScore("011101"));
    }

    public static int maxScore(String s) {
        int allOnes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                allOnes++;
            }
        }

        int maxScore = 0;

        int nools = 0;
        int ones = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                nools++;
            } else {
                ones++;
            }
            maxScore = Math.max(maxScore, nools + allOnes - ones);
        }
        return maxScore;
    }
}