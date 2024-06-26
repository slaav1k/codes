from itertools import accumulate

a = input().split()

for value in accumulate([x + " " for x in a]):
    print(value)
