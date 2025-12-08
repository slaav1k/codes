class Solution {
    public int countTriples(int n) {
        int count = 0;

        for (int c = 1; c <= n; c++) {
            int l = 1;
            int r = n;

            while (l <= r) {
                int sum = l * l + r * r;
                int target = c * c;

                if (sum == target) {
                    if (l != r) {
                        count += 2;
                    } else {
                        count += 1;
                    }
                    l++;
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return count;
    }
}