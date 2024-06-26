from itertools import chain

a = input().split(", ")
b = input().split(", ")
c = input().split(", ")

values = list(chain(a, b, c))


for i, el in enumerate(sorted(values), start=1):
    print(f"{i}. {el}")

