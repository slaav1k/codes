
def relativeSortArray(arr1, arr2):
    # efwwfe
    a = 0
    for i in range(len(arr2)):
        for j in range(len(arr1)):
            if arr1[j] == arr2[i]:
                arr1[a], arr1[j] = arr1[j], arr1[a]
                a += 1
    arr1[a:] = sorted(arr1[a:])
    return arr1