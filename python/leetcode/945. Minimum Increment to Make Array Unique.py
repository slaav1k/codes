def minIncrementForUnique(nums):
        nums = sorted(nums)
        k = 0
        for i in range(1, len(nums)):
            if nums[i] <= nums[i - 1]:
                dev = nums[i - 1] - nums[i] + 1
                nums[i] = nums[i - 1] + 1
                k += dev
        return k