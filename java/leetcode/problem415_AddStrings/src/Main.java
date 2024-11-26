public class Main {
    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int sum = 0;
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        while (len1 >= 0 || len2 >= 0 || carry > 0) {
            int k1 = len1 >= 0 ? num1.charAt(len1--) - '0' : 0;
            int k2 = len2 >= 0 ? num2.charAt(len2--) - '0' : 0;
            sum = k1 + k2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }
        return sb.reverse().toString();
    }
}