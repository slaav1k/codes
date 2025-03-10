public class Main {
    public static void main(String[] args) {
        System.out.println(addSpaces("LeetcodeHelpsMeLearn", new int[] {8, 13, 15}));
        System.out.println(addSpaces("icodeinpython", new int[] {1, 5, 7, 9}));
        System.out.println(addSpaces("spacing", new int[] {0, 1, 2, 3, 4, 5, 6}));
    }

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int countSpaces = spaces.length;
        int k = 0;
        int i = 0;
        while ((i < s.length())) {
            if (k < countSpaces && i == spaces[k]) {
                sb.append(" ");
                k++;
            }
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}