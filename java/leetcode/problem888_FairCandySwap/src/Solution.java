import java.util.Arrays;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;
        for (int aliceSize : aliceSizes) {
            sumAlice += aliceSize;
        }
        for (int bobSize : bobSizes) {
            sumBob += bobSize;
        }

        int diff = (sumAlice - sumBob) / 2;

        Arrays.sort(aliceSizes);
        for (int num: bobSizes) {
            if (binarySearch(aliceSizes, num + diff) != -1) {
                return new int[] {num + diff, num};
            }
        }

        return null;
    }

    private int binarySearch(int[] arr,int target){

        int s = 0, e = arr.length-1;

        while(s <= e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) s=mid+1;
            else e = mid - 1;
        }
        return -1;
    }


}