import sys


def main():
    r, b = map(int, input().split())
    total = (r + 4) // 2

    for h in range(3, total):
        w = total - h
        if w < h:
            break
        if (w - 2) * (h - 2) == b:
            print(w, h)
            break


if __name__ == '__main__':
    main()
