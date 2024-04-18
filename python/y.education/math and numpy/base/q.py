s = int(input())
d = input()[::-1]
p = 0
for i in range(len(d)):
    if i == 0 and d[i] == 1:
        p += 1
    p += 2 ** i * int(d[i])
print(s + p)
