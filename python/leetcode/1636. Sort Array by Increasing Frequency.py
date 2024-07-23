from typing import Counter


def frequencySort(nums):
    r = Counter(nums)
    return sorted(nums, key=lambda x: (r[x], -x))
