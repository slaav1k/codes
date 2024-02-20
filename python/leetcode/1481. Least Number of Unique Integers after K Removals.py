

from collections import defaultdict
from typing import List


def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
    dict = defaultdict(int)
    for x in arr:
        dict[x] += 1

    sorted_counts = sorted(arr.values())

    num_unique = len(sorted_counts)
    for freq in sorted_counts:
        if k >= freq:
            k -= freq
            num_unique -= 1
        else:
            break

    return num_unique
