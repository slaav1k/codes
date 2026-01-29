import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.uncommonFromSentences(
                "this apple is sweet", "this apple is sour"
        )));
    }
}