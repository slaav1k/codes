from collections import Counter


def commonChars(words):
    ls = [Counter(x) for x in words]
    
    word = ls[0]

    for w in ls[1:]:
        for i in word:
            if i in w:
                word[i] = min(w[i], word[i])
            else:
                word[i] = 0
    result = []
    for char, count in word.items():
        result.extend([char] * count)
    
    return result


print(commonChars(["bella","label","roller"]))
