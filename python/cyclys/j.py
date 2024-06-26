napr = input()

x, y = 0, 0
s, v, u, z = 0, 0, 0, 0
while napr != "СТОП":
    if napr == "СЕРВЕР":
        s, v, u, z = 1, 0, 0, 0
    elif napr == "ВОСТОК":
        s, v, u, z = 0, 1, 0, 0
    elif napr == "ЮГ":
        s, v, u, z = 0, 0, 1, 0
    elif napr == "ЗАПАД":
        s, v, u, z = 0, 0, 0, 1
    else:
        if napr != "СТОП":
            if s == 1:
                x += int(napr)
            if u == 1:
                x -= int(napr)
            if z == 1:
                y -= int(napr)
            if v == 1:
                y += int(napr)
    napr = input()
print(x)
print(y)
