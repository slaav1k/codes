//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countValidSelections(new int[]{1, 0, 2, 0, 3}));
        System.out.println(s.countValidSelections(new int[]{2, 3, 4, 0, 4, 1, 0}));
    }
}