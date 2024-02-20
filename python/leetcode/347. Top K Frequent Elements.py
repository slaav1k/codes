from collections import defaultdict
from collections import Counter


def topKFrequent(nums, k):
    counter = Counter(nums)
    return [x[0] for x in counter.most_common(k)]


topKFrequent([1], k=1)
