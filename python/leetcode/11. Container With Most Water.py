def maxArea(height) -> int:
    max_value = 0
    l, p = 0, len(height) - 1
    while l < p:
        min_hight = min(height[l], height[p])
        max_value = max(max_value, min_hight * (p - l))
        if height[l] < height[p]:
            l += 1
            while height[l] < min_hight:
                l += 1
        else:
            p -= 1
            while height[p] < min_hight:
                p -= 1

    return max_value


print(maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]))
