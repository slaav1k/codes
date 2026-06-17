public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.processStr("a#b%*", 1));
        System.out.println(s.processStr("cd%#*#", 3));
        System.out.println(s.processStr("z*#", 0));
    }
}