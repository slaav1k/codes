public class Main {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        int maxLength = Math.max(a.length(), b.length());
        int carry = 0;
        StringBuilder result = new StringBuilder();

        StringBuilder st_a = new StringBuilder(a).reverse();
        StringBuilder st_b = new StringBuilder(b).reverse();

        for (int i = 0; i < maxLength; i++) {
            int bitA = i < st_a.length() ? st_a.charAt(i) - '0' : 0;
            int bitB = i < st_b.length() ? st_b.charAt(i) - '0' : 0;

            int sum = bitA + bitB + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
