public class Main {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }

    public static String reverseVowels(String s){
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(String.valueOf(c))) {
                sb.append(c);
            }
        }

        sb = sb.reverse();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(String.valueOf(c))) {
                result.append(sb.charAt(k));
                k++;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

}