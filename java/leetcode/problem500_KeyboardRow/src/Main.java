import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }

    public static String[] findWords(String[] words) {
        String first = "qwertyuiopQWERTYUIOP";
        String second = "asdfghjklASDFGHJKL";
        String third = "zxcvbnmZXCVBNM";
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int k1 = 0, k2 = 0, k3 = 0, lenI = words[i].length();
            for (int j = 0; j < lenI; j++) {
                char c = words[i].charAt(j);
                if (first.contains(Character.toString(c))) {
                    k1++;
                } else if (second.contains(Character.toString(c))) {
                    k2++;
                } else if (third.contains(Character.toString(c))) {
                    k3++;
                }
                if (k1 == lenI || k2 == lenI || k3 == lenI) {
                    res.add(words[i]);
                }
            }
        }
        String[] ans = new String[res.size()];
        res.toArray(ans);
        return ans;
    }
}