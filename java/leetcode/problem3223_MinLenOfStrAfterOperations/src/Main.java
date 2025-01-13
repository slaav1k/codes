public class Main {
    public static void main(String[] args) {
        System.out.println(minimumLength("abaacbcbb"));
        System.out.println(minimumLength("aa"));
    }

    public static int minimumLength(String s) {
        int[] counts = new int[26];
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (counts[i] == 0) {
                continue;
            }
            if (counts[i] % 2 == 0) {
                total += 2;
            } else {
                total += 1;
            }
        }
        return total;
    }
}