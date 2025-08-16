class Solution:
    def maximum69Number(self, num: int) -> int:
        if '6' not in str(num):
            return num
        nums = []
        nums.append(num)
        num = str(num)
        for i in range(len(num)):
            if num[i] == '6':
                tmp = num[:i] + '9' + num[i+1:]
                nums.append(int(tmp))
        return max(nums)

solution = Solution()
print(solution.maximum69Number(9669))
print(solution.maximum69Number(9996))
print(solution.maximum69Number(9999))

