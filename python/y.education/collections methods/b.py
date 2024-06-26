a = input().split(', ')
b = input().split(", ")

for i in list(zip(a, b)):
    print(f'{i[0]} - {i[1]}')