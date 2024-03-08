
def lengthOfLongestSubstring(s: str) -> int:
    symb = set()
    lenght = 0
    maxLenght = 0
    l = 0
    for r in range(len(s)):
        while s[r] in symb:
            symb.remove(s[l])
            l += 1
        symb.add(s[r])
        maxLenght = max(maxLenght, r - l + 1)
    return maxLenght


print(lengthOfLongestSubstring("dvdf"))
