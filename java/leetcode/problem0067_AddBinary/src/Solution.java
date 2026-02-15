class Solution {
    public String addBinary(String a, String b) {
        int maxLength = Math.max(a.length(), b.length());
        int carry = 0;
        StringBuilder res = new StringBuilder();

        StringBuilder stA = new StringBuilder(a).reverse();
        StringBuilder stB = new StringBuilder(b).reverse();

        int bitA, bitB, sum;

        for (int i = 0; i < maxLength; i++) {
            bitA = i < stA.length() ? stA.charAt(i) - '0' : 0;
            bitB = i < stB.length() ? stB.charAt(i) - '0' : 0;

            sum = bitA + bitB + carry;
            res.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            res.append(carry);
        }

        return res.reverse().toString();
    }
}