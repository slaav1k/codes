from collections import Counter

class Solution:
    def longestPalindrome(self, s: str) -> int:

        a = list(s)

        d = Counter(a)

        le = 0

        f = False
        for x in d.values():
            if x % 2 == 0:
                le += x
            else:
                f = True
                le += x - 1

        if f:
            le += 1
        
        return le