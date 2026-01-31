public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.nextGreatestLetter(
                new char[] {'c','f','j'}, 'a'
        ));
        System.out.println(solution.nextGreatestLetter(
                new char[] {'c','f','j'}, 'c'
        ));
        System.out.println(solution.nextGreatestLetter(
                new char[] {'c','f','j'}, 'z'
        ));

    }
}