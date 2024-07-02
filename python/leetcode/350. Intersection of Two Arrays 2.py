def intersect(nums1, nums2):
    k = list(set(nums1) & set(nums2))
    res = []
    for i in k:
        res += min(nums1.count(i), nums2.count(i)) * [i]
    return res


print(intersect([1, 2, 2, 1], [2, 2]))
