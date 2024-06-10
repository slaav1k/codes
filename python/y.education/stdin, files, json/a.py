from sys import stdin

lines = []
for line in stdin:
    lines.append(line.rstrip("\n"))

s = 0
for i in lines:
    s += sum(map(int, i.split()))

print(s)