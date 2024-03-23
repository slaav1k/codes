def decodeMessage(key: str, message: str) -> str:
    kod = dict()
    index = ord("a")
    finish = ord("z")
    ans = ""
    for char in key:
        if char not in kod:
            kod[char] = chr(index)
            index += 1
    for char in message:
        ans += kod[char]
    return ans


decodeMessage("eljuxhpwnyrdgtqkviszcfmabo",
              "zwx hnfx lqantp mnoeius ycgk vcnjrdb")
