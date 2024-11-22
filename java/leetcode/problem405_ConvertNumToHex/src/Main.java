//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(toHex(26));
    }

    public static String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int remainder = num & 0xF;
            if (remainder < 10) {
                sb.append(remainder);
            }
            else {
                sb.append((char)('a' + remainder - 10));
            }
            num = num >> 4;
        }
        return sb.reverse().toString();

    }
}