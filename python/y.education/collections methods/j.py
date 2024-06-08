from itertools import combinations

count = int(input())
nums = range(1, count)

print("А Б В")
for i, j in list(combinations(nums, 2)):
    print(f"{i} {j - i} {count - j}")