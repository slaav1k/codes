class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;
        long[] done = new long[n + 1];

        for (int k : mana) {
            for (int i = 0; i < n; ++i) {
                done[i + 1] = Math.max(done[i + 1], done[i]) + (long) k * skill[i];
            }
            for (int i = n - 1; i > 0; --i) {
                done[i] = done[i + 1] - (long) k * skill[i];
            }
        }
        
        return done[n];
    }
}