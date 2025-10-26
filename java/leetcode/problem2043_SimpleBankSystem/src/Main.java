//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bank obj = new Bank(new long[] {10, 100, 20, 50, 30});
        obj.withdraw(3, 10);
        obj.transfer(5, 1, 20);
        obj.deposit(5, 20);
        obj.transfer(3, 4, 15);
        obj.deposit(10, 50);
    }
}