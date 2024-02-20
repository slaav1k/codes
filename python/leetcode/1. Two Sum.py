from typing import List


def twoSum(nums: List[int], target: int) -> List[int]:
    dict = {}
    for i, val in enumerate(nums):
        ostatok = target - val
        if ostatok in dict:
            return [dict[ostatok], i]
        else:
            dict[val] = i


print(twoSum([2, 7, 11, 15], 9))
