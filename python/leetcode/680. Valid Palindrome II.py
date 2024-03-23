def validPalindrome(s: str) -> bool:
    l = 0
    r = len(s) - 1
    while l <= r:
        if s[l] != s[r]:
            tmpS = s[:l] + s[l + 1:]
            tmpS2 = s[:r] + s[r + 1:]
            return tmpS == tmpS[::-1] or tmpS2 == tmpS2[::-1]
        l += 1
        r -= 1
    return True


validPalindrome("abc")
