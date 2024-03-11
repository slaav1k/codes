def minWindow(self, s: str, t: str) -> str:
    t_counter = defaultdict(int)
    for char in t:
        t_counter[char] += 1
    t_unique_count = len(t_counter)

    s_counter = defaultdict(int)
    s_unique_count = 0

    result = None
    result_len = float("inf")

    l_ptr = 0
    for r_ptr in range(len(s)):
        new_char = s[r_ptr]
        s_counter[new_char] += 1

        if new_char in t_counter and s_counter[new_char] == t_counter[new_char]:
            s_unique_count += 1

        while s_unique_count == t_unique_count:
            cur_len = r_ptr - l_ptr + 1
            if cur_len < result_len:
                result = (l_ptr, r_ptr)
                result_len = cur_len

            del_char = s[l_ptr]
            s_counter[del_char] -= 1
            if del_char in t_counter and s_counter[del_char] < t_counter[del_char]:
                s_unique_count -= 1
            l_ptr += 1

    if result_len == float("inf"):
        return ""

    l_ptr, r_ptr = result
    return s[l_ptr, r_ptr + 1]
