//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxDistinctElements(new int[] {1,2,2,3,3,4}, 2));
        System.out.println(s.maxDistinctElements(new int[] {4,4,4,4}, 1));
    }
}