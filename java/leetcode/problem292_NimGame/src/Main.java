//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(canWinNim(2));
    }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}