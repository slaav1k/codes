public class Main {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement(2));
        System.out.println(findComplement(1));
    }

    public static int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                res.append('0');
            } else {
                res.append('1');
            }
        }
        return Integer.parseInt(res.toString(), 2);
    }
}