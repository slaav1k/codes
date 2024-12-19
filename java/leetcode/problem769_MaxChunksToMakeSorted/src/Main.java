public class Main {
    public static void main(String[] args) {
        System.out.println(maxChunksToSorted(new int[] {4, 3, 2, 1, 0}));
        System.out.println(maxChunksToSorted(new int[] {1, 0, 2, 3, 4}));
    }

    public static int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int chunks = 0;
        int preSum = 0;
        int sortPreSum = 0;

        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            sortPreSum += i;
            if (preSum == sortPreSum) {
                chunks++;
            }
        }
        return chunks;
    }
}