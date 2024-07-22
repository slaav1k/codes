def sortPeople(names, heights):
    return [n for x, n in sorted(zip(heights, names), reverse=True)]
