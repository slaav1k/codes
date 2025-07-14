//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode first = new ListNode(1);
        first.next = new ListNode(0);
        first.next.next = new ListNode(1);
        System.out.println(solution.getDecimalValue(first));
        ListNode second = new ListNode(0);
        System.out.println(solution.getDecimalValue(second));
    }
}