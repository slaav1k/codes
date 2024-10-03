//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{1, 2, 3}));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if (i == digits.length - 1) {
                digits[i]++;
            }
            if (digits[i] > 9) {
                digits[i] = digits[i] - 10;
                carry = 1;
            }
            else {
                carry = 0;
            }

        }
        if (carry == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}