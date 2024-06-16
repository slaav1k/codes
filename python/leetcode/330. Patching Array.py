def minPatches(nums, n):
    miss = 1
    result = 0
    i = 0

    while miss <= n:
        if i < len(nums) and nums[i] <= miss:
            miss += nums[i]
            i += 1
        else:
            miss += miss
            result += 1

    return result