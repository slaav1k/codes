public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.validateCoupons(
                new String[]{"SAVE20", "", "PHARMA5", "SAVE@20"},
                new String[]{"restaurant", "grocery", "pharmacy", "restaurant"},
                new boolean[]{true, true, true, true})
        );
        System.out.println(s.validateCoupons(
                new String[]{"GROCERY15", "ELECTRONICS_50", "DISCOUNT10"},
                new String[]{"grocery", "electronics", "invalid"},
                new boolean[]{false, true, true})
        );
    }
}