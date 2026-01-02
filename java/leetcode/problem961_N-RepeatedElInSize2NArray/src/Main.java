public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.repeatedNTimes(new int[]{1, 2, 3, 3}));
        System.out.println(s.repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}));
        System.out.println(s.repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}));
        System.out.println(s.repeatedNTimes(new int[]{12, 62, 62, 30, 62, 96, 97, 62, 62, 6, 73, 62, 62, 5, 62, 8, 64, 62, 18, 62}));
    }
}