import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n = code.length;
        List<String> res = new ArrayList<>();
        Pattern p = Pattern.compile("^[a-zA-Z0-9_]+$");
        List<String> categories = Arrays.asList("electronics", "grocery", "pharmacy", "restaurant");

        for (int i = 0; i < n; i++) {
            String cod = code[i];
            String line = businessLine[i];
            boolean isAct = isActive[i];

            if (cod != null && !cod.isEmpty() && p.matcher(cod).matches() &&
                categories.contains(line) && isAct) {
                res.add(cod);
            }
        }

        res.sort(Comparator.comparingInt((String c) -> {
            for (int j = 0; j < code.length; j++) {
                if (code[j].equals(c)) {
                    return categories.indexOf(businessLine[j]);
                }
            }
            return Integer.MAX_VALUE;
        }).thenComparing(c -> c));

        return res;
    }
}