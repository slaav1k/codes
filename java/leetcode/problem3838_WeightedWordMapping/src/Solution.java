class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int weight;
        StringBuilder res = new StringBuilder();
        for (String word: words) {
            weight = 0;
            int zeroPozition = 'a';
            for (char c: word.toCharArray()) {
                weight += weights[c - zeroPozition];
            }
            res.append(Character.toChars(zeroPozition + 25 - weight % 26));
        }
        return res.toString();
    }
}