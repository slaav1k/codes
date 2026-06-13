public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.mapWordWeights(
                new String[] {"abcd", "def", "xyz"},
                new int[] {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2}
        ));
    }
}