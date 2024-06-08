from itertools import combinations

ls = []
n = int(input())
for x in range(n):
    ls.append(input())

values = list(combinations(ls, 2))
for i in values:
    print(f"{i[0]} - {i[1]}")