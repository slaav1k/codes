def groupAnagrams(strs):
    if len(strs) == 1:
        return [strs]
    dict = {}
    for i in strs:
        sl = ""
        if i != "":
            sl = "".join(sorted(list(i))).lower()
        if sl in dict:
            dict[sl] += f' {i}'
        else:
            dict[sl] = i
    return [x.split() for x in dict.values()]


print(groupAnagrams(["", ""]))
