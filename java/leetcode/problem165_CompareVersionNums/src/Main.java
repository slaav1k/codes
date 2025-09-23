//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.compareVersion("1.2", "1.10"));
        System.out.println(s.compareVersion("1.01", "1.001"));
        System.out.println(s.compareVersion("1.0", "1.0.0.0"));
        System.out.println(s.compareVersion("1.1.1.1", "1.1.1.1"));
    }
}