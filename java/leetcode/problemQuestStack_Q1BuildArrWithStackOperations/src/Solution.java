import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<String>();

        String push = "Push";
        String pop = "Pop";

        int num = 0;
        int lastNum = target[target.length - 1];

        for (int i = 1; i <= n; i++) {
            if (i == lastNum) {
                res.add(push);
                break;
            }
            res.add(push);

            if (i == target[num]) {
                num++;
            } else {
                res.add(pop);
            }


        }

        return res;

    }
}