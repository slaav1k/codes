import sys

def checkAvailable(a, b, c, d, e):
    if ((a <= d and b <= e) or (a <= e and b <= d) or
        (a <= d and c <= e) or (a <= e and c <= d) or
        (c <= d and b <= e) or (c <= e and b <= d)):
        return "YES"
    return "NO"

def main():
    a, b, c, d, e = (int(input()) for _ in range(5))
    print(checkAvailable(a, b, c, d, e))


if __name__ == '__main__':
    main()
