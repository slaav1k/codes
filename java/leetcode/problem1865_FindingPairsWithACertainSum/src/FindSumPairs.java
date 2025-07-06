import java.util.HashMap;
import java.util.Map;

class FindSumPairs {
    private int[] _nums1;
    private int[] _nums2;
    private Map<Integer, Integer> _freqMap2;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this._nums1 = nums1;
        this._nums2 = nums2;

        _freqMap2 = new HashMap<>();
        for (int num : nums2) {
            _freqMap2.put(num, _freqMap2.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int oldVal = _nums2[index];
        int newVal = oldVal + val;
        _nums2[index] = newVal;

        _freqMap2.put(oldVal, _freqMap2.get(oldVal) - 1);
        if (_freqMap2.get(oldVal) == 0) {
            _freqMap2.remove(oldVal);
        }

        _freqMap2.put(newVal, _freqMap2.getOrDefault(newVal, 0) + 1);
    }

    public int count(int tot) {
        int count = 0;
        for (int num1 : _nums1) {
            int need = tot - num1;
            count += _freqMap2.getOrDefault(need, 0);
        }
        return count;
    }
}
