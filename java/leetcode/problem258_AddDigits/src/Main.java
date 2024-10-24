//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(addDigits(1));
    }

    public static int addDigits(int num) {
        if (num < 10) return num;
        int sum = 0;
        String s = Integer.toString(num);
        while (s.length() > 1) {
            sum = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                sum += s.charAt(i) - '0';
            }
            s = Integer.toString(sum);
        }
        return sum;
    }
}