import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int n  = digits.length;
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum >= 10) {
                digits[i] = sum % 10;
                carry = sum / 10;
            }
            else {
                digits[i] = sum;
                carry = 0;
                break;
            }
        }
        if (carry > 0) {
            int[] digits2 = new int[digits.length + 1];
            digits2[0] = carry;
            System.arraycopy(digits, 0, digits2, 1, digits.length);
            return  digits2;
        }
        return digits;
    }
}