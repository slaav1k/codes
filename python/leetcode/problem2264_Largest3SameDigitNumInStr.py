class Solution:
    def largestGoodInteger(self, num: str) -> str:
            for i in range(9, -1, -1):
                tmp = str(i) * 3
                if tmp in num:
                    return tmp
            return ""

solution = Solution()

print(solution.largestGoodInteger("6777133339"))
print(solution.largestGoodInteger("2300019"))
print(solution.largestGoodInteger("42352338"))