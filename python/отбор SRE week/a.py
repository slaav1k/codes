def find_peak_time(n, intervals):
    s = []
    for i, (start, end) in enumerate(intervals):
        s.append((start, 1))
        s.append((end, -1))

    count, max_count, peak_time = 0, 0, -1
    for time, change in sorted(s):
        count += change
        if count > max_count:
            max_count = count
            peak_time = time

    return peak_time


n = int(input())
intervals = [tuple(map(int, input().split())) for _ in range(n)]
print(find_peak_time(n, intervals))
