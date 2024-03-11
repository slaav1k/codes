def characterReplacement(self, s: str, k: int) -> int:
    dic = defaultdict()
    max_str = 0
    res = 0
    l = 0
    for r in range(0, len(s)):
        dic[s[r]] += 1
        max_str = max(dic.values())
        if (l - r + 1) - max_str > k:
            dic[s[l]] -= 1
            l += 1
        res = max(res, r - l + 1)
    return res
